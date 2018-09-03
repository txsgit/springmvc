package com.kxt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kxt.common.WeiXinConfig;
import com.kxt.domain.CourseEntity;
import com.kxt.domain.User;
import com.kxt.service.CourseDistributeService;
import com.kxt.service.CourseService;
import com.kxt.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	

	@Autowired
	UserService userService;
	
	@Autowired
	WeiXinConfig weiXinConfig;
	
	@Autowired
	CourseDistributeService courseDistributeService;
	
	@Autowired
	CourseService courseService;
	
	/**
	 * 用户测试
	 * @return
	 */
	@RequestMapping("/showUser")
	public String userInfo(HttpServletRequest req)
	{
		
		/*IdGenerator  idGenerator= new CommonSelfIdGenerator();
		idGenerator.generateId().longValue();*/
		//增
		/*for(int i=11;i<=20;i++)
		{
			User user = new User();
			IdGenerator  idGenerator= new CommonSelfIdGenerator();
			user.setId(idGenerator.generateId().longValue());
			user.setEnterpriseId(new Long(i));
			user.setName("aaa");
			user.setNickName("a3");
			user.setPassword("123456");
			user.setPhone("13601405865");
			 //user = userService.getUSer(user);
			userService.addUSer(user);
			 req.setAttribute("user", user);
		}*/
		//删
		/*Map<String,Object> delMap=new HashMap<String, Object>();
//		delMap.put("enterpriseId", 1);
		delMap.put("id", "226762320368369664");
		userService.deleteUser(delMap);*/
		//改
		/*User update = new User();
		update.setId(226762320691331072l);
//		update.setName("txs");
		update.setEnterpriseId(2l);
		userService.updateUser(update);*/
		//查
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("enterpriseId", 2);
//		map.put("id", "226762315922407424");
		List<User> users=userService.selectUser(map);
		 req.setAttribute("users", users);
		
		return "user";
	}
	
	/**
	 * 课程
	 * @return
	 */
	@RequestMapping("/showCourse")
	public String showCourse(HttpServletRequest req)
	{
		
		
		String pageNum=req.getParameter("pageNum");
		if(StringUtils.isEmpty(pageNum))
		{
			pageNum="1";
		}
		
		long date1=System.currentTimeMillis();
		//查询外部课程
		Map<String,Object> dismap=new HashMap<String, Object>();
		dismap.put("enterpriseId", 102);
		List<String> distributeIds=courseService.selectDistributeIds(dismap);
		
		//查询企业内部课程
		List<String> enterCourseIds=courseService.selectEnterCourses(dismap);
		enterCourseIds.addAll(distributeIds);
		if(!CollectionUtils.isEmpty(enterCourseIds))
		{
			//去重
			//去重课程ID
			Set set = new HashSet();
			List newList = new ArrayList();    
			enterCourseIds.forEach(courseId  ->{
				if (set.add(courseId)){
					newList.add(courseId);    
				}
			});
			enterCourseIds.clear();
			enterCourseIds.addAll(newList);
			//根据得到的课程ID,排序查询，并分页
			PageHelper.startPage(Integer.parseInt(pageNum), 15);
			Map<String,Object> map=new HashMap<String, Object>();
			map.put("courseIdList", enterCourseIds);
			map.put("enterpriseId", 102);
			map.put("enterpriseType","ENTERPRISE");
			map.put("orderRule", "statistic.signupNum desc,t1.createTime desc");
			List<CourseEntity> list=courseService.searchCourseList(map);
			
			PageInfo pageInfo = new PageInfo<CourseEntity>(list);
			long date2=System.currentTimeMillis();
		     System.out.println(date2-date1);
			req.setAttribute("pageInfo", pageInfo);
		}
		
				
		/* 
		PageHelper.startPage(Integer.parseInt(pageNum), 15);
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("enterpriseId", 102);
		map.put("enterpriseType","kttx");
		map.put("orderRule", "T.createTime DESC,T.startTime DESC");
		long date1=System.currentTimeMillis();
		List<CourseCenterEntity> list=courseService.selectCourseCenter(map);
		PageInfo pageInfo = new PageInfo<CourseCenterEntity>(list);
		long date2=System.currentTimeMillis();
	     System.out.println(date2-date1);*/
//	     
//		req.setAttribute("pageInfo", pageInfo);
		return "course";
	}
	
	/**
	 * 用户登录
	 * @param req
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/login")
	public String login(HttpServletRequest req,User user)
	{
		req.setAttribute("phone", user.getPhone());
		return "success";
	}
	
	/**
	 * 登出
	 * @param req
	 * @return
	 */
	@RequestMapping(value="logout")
	public String logout(HttpServletRequest req)
	{

		return "login";
	}

}
