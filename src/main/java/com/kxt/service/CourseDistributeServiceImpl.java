package com.kxt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kxt.dao.CourseDistributeMapper;
import com.kxt.domain.CourseDistributeEntity;

/**
 * Created by noteless on 2017/9/19.
 * Description:
 */
@Service
public class CourseDistributeServiceImpl implements CourseDistributeService {

    @Autowired
    CourseDistributeMapper courseDistributeMapper;



	
	/**
	 * 查询平台分发的课程ID
	 * @param map
	 * @return
	 */
	public List<CourseDistributeEntity> selectDistributeIds(Map<String,Object> map)
	{
		return courseDistributeMapper.selectDistributeIds(map);
	}
	
	
	/**
	 * 查询外部启用的课程
	 * @param map
	 * @return
	 */
	public List<CourseDistributeEntity> selectDistributeEnableCourseList(Map<String,Object> map)
	{
		return courseDistributeMapper.selectDistributeEnableCourseList(map);
	}
	
	
}
