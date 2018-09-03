package com.kxt.domain;





/**
 * kttx_course_basics
 * 课程基础表
 *
 */
public class CourseBasicsEntity  {
	
	
	 String courseName;//课程名称
	 String label;//课程标签（标签以逗号隔开）
	 String lecturer;//讲师名称
	 String lecturerTelephone;//讲师电话
	 String lecturerInfo;//讲师信息
	 String detail;//课程详情

	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getLecturer() {
		return lecturer;
	}
	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}
	public String getLecturerTelephone() {
		return lecturerTelephone;
	}
	public void setLecturerTelephone(String lecturerTelephone) {
		this.lecturerTelephone = lecturerTelephone;
	}
	public String getLecturerInfo() {
		return lecturerInfo;
	}
	public void setLecturerInfo(String lecturerInfo) {
		this.lecturerInfo = lecturerInfo;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
	
	
	
	
	
	
	
}
