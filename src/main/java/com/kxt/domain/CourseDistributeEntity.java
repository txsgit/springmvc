package com.kxt.domain;

import java.util.Date;
import java.util.List;


/**
 * 课程分发
 * @author txs
 *
 */
public class CourseDistributeEntity {

	private Long id;//ID
	private String courseId;//课程ID
	private String sourceCourseId;//库课程的源课程ID
	private Long enterpriseId;//所属企业ID（其中1代表课通天下平台）
	
	private String status;//分发状态：ENABLE（启用），DISABLE（停用） OFFSHELVES（下架）
	
	private Integer  courseType;//课程类型（1、直播、2、库直播、3、点播，4、库点播，5、线下课、6、库线下课）
	/**
	 * 关联类型
	 * @author Administrator
	 *
	 */
	public enum Status {
	   ENABLE("启用"),
	   DISABLE("停用"),
	   OFFSHELVES("下架");
	   
	    private String text;

	    Status(String text) {
	        this.text = text;
	    }

	    public String getText() {
	        return text;
	    }
	}
	private Date createTime;//创建时间
	
	private String readOrNot;//是否已读
	
	private List<Long> idList;//查询条件，学习平台id集合 
	
	public enum ReadOrNot{
		READ("已读"),
		UNREAD("未读");
		private String text;
		ReadOrNot(String text){
			this.text = text;
		}
		public String getText(){
			return text;
		}
	}

	private CourseEntity courseEntity;
	
	
	
	
	public CourseEntity getCourseEntity() {
		return courseEntity;
	}
	public void setCourseEntity(CourseEntity courseEntity) {
		this.courseEntity = courseEntity;
	}
	public Integer getCourseType() {
		return courseType;
	}
	public void setCourseType(Integer courseType) {
		this.courseType = courseType;
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
	public String getSourceCourseId() {
		return sourceCourseId;
	}
	public void setSourceCourseId(String sourceCourseId) {
		this.sourceCourseId = sourceCourseId;
	}
	public Long getEnterpriseId() {
		return enterpriseId;
	}
	public void setEnterpriseId(Long enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getReadOrNot() {
		return readOrNot;
	}
	public void setReadOrNot(String readOrNot) {
		this.readOrNot = readOrNot;
	}
	public List<Long> getIdList() {
		return idList;
	}
	public void setIdList(List<Long> idList) {
		this.idList = idList;
	}

}
