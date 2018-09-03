package com.kxt.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 课程属性
 * @author txs
 *
 */
public class CoursePropertyEntity {

	private Long id;//ID
	private String courseId;//课程ID
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date startTime;//课程开始时间
	
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date endTime;//课程结束时间
	
	private Date signupCloseTime;//报名截止时间
	
	private String city;//课程所在城市
	private String place;//上课详细地址
	
	private Integer  isReward;//是否打赏：1否；2是
	private String rewardQRcode;//打赏二维码
	private String pictureDetail;//图文详情
	/**
	 * 图文课类型：PICTURE(图文);PDF(pdf)  注：只有图文课此字段才有意义
	 */
	private PictureType pictureType;
	
	/**
	 * 图文课类型枚举
	 */
	public enum PictureType {
		PICTURE("图文"),
		PDF("pdf");
		private String text;
		
		PictureType(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
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
	public Date getSignupCloseTime() {
		return signupCloseTime;
	}
	public void setSignupCloseTime(Date signupCloseTime) {
		this.signupCloseTime = signupCloseTime;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Integer getIsReward() {
		return isReward;
	}
	public void setIsReward(Integer isReward) {
		this.isReward = isReward;
	}
	public String getRewardQRcode() {
		return rewardQRcode;
	}
	public void setRewardQRcode(String rewardQRcode) {
		this.rewardQRcode = rewardQRcode;
	}
	public String getPictureDetail() {
		return pictureDetail;
	}
	public void setPictureDetail(String pictureDetail) {
		this.pictureDetail = pictureDetail;
	}
	public PictureType getPictureType() {
		return pictureType;
	}
	public void setPictureType(PictureType pictureType) {
		this.pictureType = pictureType;
	}
	
}
