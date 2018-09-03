package com.kxt.dao;

import java.util.List;
import java.util.Map;

import com.kxt.domain.CourseDistributeEntity;

/**
 * 课程分发mapper
 * @author txs
 *
 */
public interface CourseDistributeMapper {
	
 

	/**
	 * 查询平台分发的课程ID
	 * @param map
	 * @return
	 */
	public List<CourseDistributeEntity> selectDistributeIds(Map<String,Object> map);
	
	/**
	 * 查询外部启用的课程
	 * @param map
	 * @return
	 */
	public List<CourseDistributeEntity> selectDistributeEnableCourseList(Map<String,Object> map);
	

	
}
