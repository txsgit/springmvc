package com.kxt.domain;

import java.math.BigDecimal;
import java.util.Date;

/**课程的统计信息
 * @author joy
 *
 */
public class CourseStatisticEntity {

	private Integer id; 
	private String  sourceCourseId;     //源课程ID
	private String  courseBasicsId;     //基础课程ID
	private Long    viewNum;            //课程浏览量
	private Long    shareNum;           //课程分享量
	private Long    signupNum;          //课程报名人数
	private Long    attentionNum;       //课程收藏量
	private Long    commentNum;         //课程评论量
	//private Long    notesNum;         //课程笔记量
	private Long    interlocutionNum;   //课程问答量
	private Long    treadNum;           //课程踩数量
	private Long    praiseNum;          //课程赞数量
	private Long    questionNum;        //提问的数量	
	private Long    judgeNum;           //评价人数
	private BigDecimal judgeAverage;    //评价平均分
	
	private BigDecimal    judgeScoreNum;           //评价总分
	private Integer interactNum;//课程互动项个数
	
	private Long finishedNum; //当天完成课程人数
	
	
	private Date createTime;//创建时间
	
	
	
	
	
	public BigDecimal getJudgeScoreNum() {
		return judgeScoreNum;
	}
	public void setJudgeScoreNum(BigDecimal judgeScoreNum) {
		this.judgeScoreNum = judgeScoreNum;
	}
	public Long getFinishedNum() {
		return finishedNum;
	}
	public void setFinishedNum(Long finishedNum) {
		this.finishedNum = finishedNum;
	}
	public Integer getInteractNum() {
		return interactNum;
	}
	public void setInteractNum(Integer interactNum) {
		this.interactNum = interactNum;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getSourceCourseId() {
		return sourceCourseId;
	}
	public void setSourceCourseId(String sourceCourseId) {
		this.sourceCourseId = sourceCourseId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getCourseBasicsId() {
		return courseBasicsId;
	}
	public void setCourseBasicsId(String courseBasicsId) {
		this.courseBasicsId = courseBasicsId;
	}
	public Long getViewNum() {
		return viewNum;
	}
	public void setViewNum(Long viewNum) {
		this.viewNum = viewNum;
	}
	public Long getShareNum() {
		return shareNum;
	}
	public void setShareNum(Long shareNum) {
		this.shareNum = shareNum;
	}
	public Long getSignupNum() {
		return signupNum;
	}
	public void setSignupNum(Long signupNum) {
		this.signupNum = signupNum;
	}
	public Long getAttentionNum() {
		return attentionNum;
	}
	public void setAttentionNum(Long attentionNum) {
		this.attentionNum = attentionNum;
	}
	public Long getCommentNum() {
		return commentNum;
	}
	public void setCommentNum(Long commentNum) {
		this.commentNum = commentNum;
	}
	public Long getInterlocutionNum() {
		return interlocutionNum;
	}
	public void setInterlocutionNum(Long interlocutionNum) {
		this.interlocutionNum = interlocutionNum;
	}
	public Long getTreadNum() {
		return treadNum;
	}
	public void setTreadNum(Long treadNum) {
		this.treadNum = treadNum;
	}
	public Long getPraiseNum() {
		return praiseNum;
	}
	public void setPraiseNum(Long praiseNum) {
		this.praiseNum = praiseNum;
	}
	public Long getQuestionNum() {
		return questionNum;
	}
	public void setQuestionNum(Long questionNum) {
		this.questionNum = questionNum;
	}
	public Long getJudgeNum() {
		return judgeNum;
	}
	public void setJudgeNum(Long judgeNum) {
		this.judgeNum = judgeNum;
	}
	public BigDecimal getJudgeAverage() {
		return judgeAverage;
	}
	public void setJudgeAverage(BigDecimal judgeAverage) {
		this.judgeAverage = judgeAverage;
	}
	
	
	
}
