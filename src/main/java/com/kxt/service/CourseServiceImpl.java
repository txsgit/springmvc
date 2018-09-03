package com.kxt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kxt.dao.CourseMapper;
import com.kxt.domain.CourseCenterEntity;
import com.kxt.domain.CourseEntity;

/**
 * 课程service实现类
 * @author txs
 *
 */
@Service
@Transactional
public class CourseServiceImpl implements CourseService {
	

	@Autowired
	CourseMapper courseMapper;
	
	
	
	/**
	 * 课程中心查询课程
	 * @param map
	 * @return
	 */
	public List<CourseCenterEntity> selectCourseCenter(Map<String, Object> map)
	{
		return courseMapper.selectCourseCenter(map);
	}
	
	
	/**
	 * 查询平台外部课程
	 * @param map
	 * @return
	 */
	public List<String> selectDistributeIds(Map<String, Object> map)
	{
		return courseMapper.selectDistributeIds(map);
	}
	
	
	/**
	 * 查询平台内部课程
	 * @param map
	 * @return
	 */
	public List<String> selectEnterCourses(Map<String, Object> map)
	{
		return courseMapper.selectEnterCourses(map);
	}

	/**
	 * 查询课程信息
	 * @param map
	 * @return
	 */
	public List<CourseEntity> searchCourseList(Map<String, Object> map)
	{
		return courseMapper.searchCourseList(map);
	}
}
