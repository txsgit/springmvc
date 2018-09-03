package com.kxt.dao;

import java.util.List;
import java.util.Map;

import com.kxt.domain.CourseCenterEntity;
import com.kxt.domain.CourseEntity;






/**
 * 课程mapper
 * @author txs
 *
 */
public interface CourseMapper {
	
 
	
	/**
	 * 课程中心查询课程
	 * @param map
	 * @return
	 */
	public List<CourseCenterEntity> selectCourseCenter(Map<String, Object> map);
	
	/**
	 * 查询平台外部课程
	 * @param map
	 * @return
	 */
	public List<String> selectDistributeIds(Map<String, Object> map);
	
	/**
	 * 查询平台内部课程
	 * @param map
	 * @return
	 */
	public List<String> selectEnterCourses(Map<String, Object> map);
	
	/**
	 * 查询课程信息
	 * @param map
	 * @return
	 */
	public List<CourseEntity> searchCourseList(Map<String, Object> map);
}
