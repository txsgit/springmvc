package com.kxt.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 课程中心
 * @author txs
 *
 */
public class CourseCenterEntity   {

	private String courseId;
	private String courseName;
	private Date createTime;
	private Long enterpriseId;
	private int coursetype;
	private int distribute;//是否是分发课  1 否；2是
	private String category;
	private BigDecimal sellPrice;//平台或学习小组 实际售价
	private Long departId; //价格部门ID,0是平台;
	private String city;
	
	private Date startTime;
	private Date endTime;
	
	private Long    signupNum;          //课程报名人数
	private Long    judgeAverage;
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Long getEnterpriseId() {
		return enterpriseId;
	}
	public void setEnterpriseId(Long enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public int getCoursetype() {
		return coursetype;
	}
	public void setCoursetype(int coursetype) {
		this.coursetype = coursetype;
	}
	public int getDistribute() {
		return distribute;
	}
	public void setDistribute(int distribute) {
		this.distribute = distribute;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public BigDecimal getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}
	public Long getDepartId() {
		return departId;
	}
	public void setDepartId(Long departId) {
		this.departId = departId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Long getSignupNum() {
		return signupNum;
	}
	public void setSignupNum(Long signupNum) {
		this.signupNum = signupNum;
	}
	public Long getJudgeAverage() {
		return judgeAverage;
	}
	public void setJudgeAverage(Long judgeAverage) {
		this.judgeAverage = judgeAverage;
	}         
	
	
	
	
}
