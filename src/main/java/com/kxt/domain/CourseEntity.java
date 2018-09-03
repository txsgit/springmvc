package com.kxt.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.JSONObject;
/**
 * 主课程类
 * @author txs
 *
 */
public class CourseEntity extends CourseBasicsEntity {

	private String id;//线下课程id
	Long userId;//课程创建者ID
	private String coursePicture;//课程图片
	private Long upperLimit;//人数上限
	private String qRCode;//课程二维码值
	private Date createTime;//课程创建时间
	private String courseHour;//学时
	private String courseScore;//学分
	private Integer type;//课程类型（1、直播，2、库直播，3、点播，4、库点播，5、线下课，6、库线下课，7、图文课）
	private String courseBasicsId;//基础课程id
	private String sourceCourseId;//库课程的源课程ID
	private Long enterpriseId;//所属企业ID（其中1代表课通天下平台）
	private String industry;//课程行业（标签以逗号隔开）
	private String positionLevel;//课程适用层级（标签以逗号隔开）
	private String relatedInternalCourse;//是否关联内训
	
	private String courseDistrubuteStatus;//外部课程状态  ENABLE（启用），DISABLE（停用） OFFSHELVES（下架）
	/**
     * 平台类型：ORG(机构)，ENTERPRISE （学习平台和好班掌）
     */
    private String enterpriseType;
    
    /**
	 * 平台类型
	 * @author Administrator
	 *
	 */
    public enum EnterpriseType {
    	ORG("机构"),
    	ENTERPRISE("学习平台");
        private String text;

        EnterpriseType(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }
    
    public enum RelatedInternalCourse {
    	YES("是"),
    	NO("否");
    	private String text;

		public String getText() {
			return text;
		}

		RelatedInternalCourse(String text) {
			this.text = text;
		}
    }
	
	/**
     * 学分获得条件,以逗号隔开
     */
    private String scoreCondition;
    
    /**
	 * 学分获得条件
	 * @author Administrator
	 *
	 */
    public enum ScoreCondition {
    	EVALUATE("评价"),
    	VIDEO("视频"),
    	TEST("测验"),
    	TICKET("面授课验票"),
    	PICTURE("图文学习");
        private String text;

        ScoreCondition(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }
    
    /**
     * 课程来源类型:ORG （机构）,ENTERPRISE（学习平台）,ROMAN（好班掌）'
     */
    private String originType;
    
    /**
	 * 课程来源类型
	 * @author Administrator
	 *
	 */
    public enum OriginType {
    	ORG("机构"),
    	ENTERPRISE("学习平台"),
    	ROMAN("好班掌");
        private String text;

        OriginType(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }
	
    private Long originId;//课程来源平台ID
    
   
	
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date startTime;//课程开始时间
	
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date endTime;//课程结束时间
	
	private String city;//课程所在城市
	
	private Long stepCount;//区别新老面授课签到
	
	public Long getStepCount() {
		return stepCount;
	}
	public void setStepCount(Long stepCount) {
		this.stepCount = stepCount;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public String getRelatedInternalCourse() {
		return relatedInternalCourse;
	}
	public void setRelatedInternalCourse(String relatedInternalCourse) {
		this.relatedInternalCourse = relatedInternalCourse;
	}


	private Integer interactNum;//课程互动项个数（默认为0）
	
	private Integer distributeNum;//课程分发平台数
	
//	private String category;//课程类别（标签以逗号隔开）
	
	
	//合作讲师申请状态
	private String cooperationLecturerState;
	
	//课程搜索查询类型用于首页分类别搜索课程
	//3,精彩直播(还未开始的直播课程type1=)    2,视频课(也叫在线课程包括直播后的点播以及上传的录播 type=1的时间结束和type=2)     1,面授课(线下课程,type=5)
	private Integer  searchType;
	private String  keyword;
	private String orderRule;            //排序方式
	private boolean isDisplay;            //是否展示,查询的是否被屏蔽的(删除的状态是被屏蔽,其他的都是展示中  课程审核状态(1、审核不通过；2、成功；3、删除；4、待审核(已屏蔽))',)
	private boolean isEvalate;
	
	private Integer isAlreadyEvalated;//用于查询指定用户是否已经评价过,查询的时候传入非空用于确定查询,返回的值表示是否评价过,有数据应该是1表示评价过,0表示未评价过
	
	private String interactItem;//互动项
	
	
	private String priceFloor;	//费用下限
	private String priceCeiling;//费用上限
	
	
	
	private List<String> citysList; //城市

	private List<String> categoryNameList; //类别名集合
	
	private List<String> courseIdList; //课程ID集合
	
	private String vodId;//点播ID(多个点播id以逗号隔开)
	private String vodName;//点播视频的名称，以逗号分隔
	
	private String videoType;//视频课  是视频还是H5(VIDEO("视频"),H5("h5课件");)
	
	//背景:在实体这边课程基础信息与课程信息已经合二为一
	//场景:想要查询基础信息课程列表,并且查询此基础课程信息创建的课程列表
	private List<CourseEntity> courseList;
	
	private BigDecimal price;//价格参数，方便传参

	private String organEnterpriseType;//是否是机构自用平台的课程
	
	private CoursePropertyEntity coursePropertyEntity;
	
	private CourseStatisticEntity courseStatisticEntity;
	
	private CoursePriceEntity coursePriceEntity;
	
	
	
	public CourseStatisticEntity getCourseStatisticEntity() {
		return courseStatisticEntity;
	}
	public void setCourseStatisticEntity(CourseStatisticEntity courseStatisticEntity) {
		this.courseStatisticEntity = courseStatisticEntity;
	}
	public CoursePriceEntity getCoursePriceEntity() {
		return coursePriceEntity;
	}
	public void setCoursePriceEntity(CoursePriceEntity coursePriceEntity) {
		this.coursePriceEntity = coursePriceEntity;
	}
	public CoursePropertyEntity getCoursePropertyEntity() {
		return coursePropertyEntity;
	}
	public void setCoursePropertyEntity(CoursePropertyEntity coursePropertyEntity) {
		this.coursePropertyEntity = coursePropertyEntity;
	}
	public List<String> getCourseIdList() {
		return courseIdList;
	}
	public void setCourseIdList(List<String> courseIdList) {
		this.courseIdList = courseIdList;
	}
	public String getCooperationLecturerState() {
		return cooperationLecturerState;
	}
	public void setCooperationLecturerState(String cooperationLecturerState) {
		this.cooperationLecturerState = cooperationLecturerState;
	}
	public String getEnterpriseType() {
		return enterpriseType;
	}
	public void setEnterpriseType(String enterpriseType) {
		this.enterpriseType = enterpriseType;
	}
	public Integer getDistributeNum() {
		return distributeNum;
	}
	public void setDistributeNum(Integer distributeNum) {
		this.distributeNum = distributeNum;
	}
	public Long getOriginId() {
		return originId;
	}
	public void setOriginId(Long originId) {
		this.originId = originId;
	}

	private String searchwords;//课程管理搜索课程名称和发布者名称
	
	
	private Integer useResource; //是否使用课通天下的资源库  1：不启用   2启用
	
	private Integer resourceCategory; //启用课通天下的库课程的 查询企业还是科通天下的分类   null 全部查  1 查询本平台的  2 查询课通天下
	
	
	
	
	private Integer courseSrc; //课程来源


	private Integer isUseLiveResource;//是否启用课通天下直播课资源(1 否   2是)
	private Integer isUseVodResource;//是否启用课通天下视频课资源(1 否   2是)
	private Integer isUseOfflineResource;//是否启用课通天下面授课资源(1 否   2是)
	private Integer isUsePictureResource;//是否启用课通天下图文课资源(1 否   2是)
    
	private Long userDepartId;//用户所属用户组ID
	
	private List<Long> departIds;//用户组ID List（指数学院用户组权限所用） 
	
	private String verifyUserName;//审核人
	
	private String oldCondition;
	
	
   
    
    
    /**
     * 学习状态
     */
    private String learnState;
    
    /**
     * 是否推送
     */
    private Integer isPush; //是否推送  1 否 2 是
    
    
    /**
     * 学习平台名称
     */
    private String enterpriseName;
    /**
     * 机构Id
     */
    private Long organId;
    /**
     * 机构名称
     */
    private String organName;
    
    private Long adminUserId;
    
    private String domainName;
    
	public String getDomainName() {
		return domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}


	private Integer  isPriceModified;//是否修改价格  1否 2是  非持久化字段

	public Integer getIsPriceModified() {
		return isPriceModified;
	}

	public void setIsPriceModified(String isPriceModified) {
		this.isPriceModified = Integer.parseInt(isPriceModified);
	}

	public void setIsPriceModified(Integer isPriceModified) {
		this.isPriceModified = isPriceModified;
	}


	private String modifiedPrice;//新价格 如果存在指定学院的价格等情况,也就是价格在本平台不唯一即视为已改价

	public String getModifiedPrice() {
		return modifiedPrice;
	}

	public void setModifiedPrice(String modifiedPrice) {
		this.modifiedPrice = modifiedPrice;
	}


	public List<Integer> visibleList;//可见范围查询,如果查询多个使用此字段


	public List<Integer> getVisibleList() {
		return visibleList;
	}

	public void setVisibleList(List<Integer> visibleList) {
		this.visibleList = visibleList;
	}

	public String getOriginType() {
		return originType;
	}
	public void setOriginType(String originType) {
		this.originType = originType;
	}
	public String getOldCondition() {
		return oldCondition;
	}
	public void setOldCondition(String oldCondition) {
		this.oldCondition = oldCondition;
	}
	public String getScoreCondition() {
		return scoreCondition;
	}
	public void setScoreCondition(String scoreCondition) {
		this.scoreCondition = scoreCondition;
	}
	public Long getUserDepartId() {
		return userDepartId;
	}
	public void setUserDepartId(Long userDepartId) {
		this.userDepartId = userDepartId;
	}
	
	public Integer getCourseSrc() {
		return courseSrc;
	}
	public void setCourseSrc(Integer courseSrc) {
		this.courseSrc = courseSrc;
	}
	
	
	
	public String getCourseDistrubuteStatus() {
		return courseDistrubuteStatus;
	}
	public void setCourseDistrubuteStatus(String courseDistrubuteStatus) {
		this.courseDistrubuteStatus = courseDistrubuteStatus;
	}
	public String getCourseHour() {
		return courseHour;
	}
	public void setCourseHour(String courseHour) {
		this.courseHour = courseHour;
	}
	public String getCourseScore() {
		return courseScore;
	}
	public void setCourseScore(String courseScore) {
		this.courseScore = courseScore;
	}
	public Integer getResourceCategory() {
		return resourceCategory;
	}
	public void setResourceCategory(Integer resourceCategory) {
		this.resourceCategory = resourceCategory;
	}
	public Integer getUseResource() {
		return useResource;
	}
	public void setUseResource(Integer useResource) {
		this.useResource = useResource;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getPositionLevel() {
		return positionLevel;
	}
	public void setPositionLevel(String positionLevel) {
		this.positionLevel = positionLevel;
	}
	public String getSearchwords() {
		return searchwords;
	}
	public void setSearchwords(String searchwords) {
		this.searchwords = searchwords;
	}
	public String getVodId() {
		return vodId;
	}
	public void setVodId(String vodId) {
		this.vodId = vodId;
	}
	public String getVodName() {
		return vodName;
	}
	public void setVodName(String vodName) {
		this.vodName = vodName;
	}
	public String getPriceFloor() {
		return priceFloor;
	}
	public void setPriceFloor(String priceFloor) {
		this.priceFloor = priceFloor;
	}
	public String getPriceCeiling() {
		return priceCeiling;
	}
	public void setPriceCeiling(String priceCeiling) {
		this.priceCeiling = priceCeiling;
	}
	
	@SuppressWarnings("static-access")
	public JSONObject  getInteractItem() {
		return (JSONObject) new JSONObject().parse(interactItem);
	}
	public void setInteractItem(String interactItem) {
		this.interactItem = interactItem;
	}
	public Integer getInteractNum() {
		return interactNum;
	}
	public void setInteractNum(Integer interactNum) {
		this.interactNum = interactNum;
	}
	
	public Integer getIsAlreadyEvalated() {
		return isAlreadyEvalated;
	}
	public void setIsAlreadyEvalated(Integer isAlreadyEvalated) {
		this.isAlreadyEvalated = isAlreadyEvalated;
	}
	public boolean isEvalate() {
		return isEvalate;
	}
	public void setEvalate(boolean isEvalate) {
		this.isEvalate = isEvalate;
	}
	
	
	public Long getUpperLimit() {
		return upperLimit;
	}
	public void setUpperLimit(Long upperLimit) {
		this.upperLimit = upperLimit;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCourseBasicsId() {
		return courseBasicsId;
	}
	public void setCourseBasicsId(String courseBasicsId) {
		this.courseBasicsId = courseBasicsId;
	}
	
	public String getSourceCourseId() {
		return sourceCourseId;
	}
	public void setSourceCourseId(String sourceCourseId) {
		this.sourceCourseId = sourceCourseId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Long getEnterpriseId() {
		return enterpriseId;
	}
	public void setEnterpriseId(Long enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getCoursePicture() {
		return coursePicture;
	}
	public void setCoursePicture(String coursePicture) {
		this.coursePicture = coursePicture;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	public String getqRCode() {
		return qRCode;
	}
	public void setqRCode(String qRCode) {
		this.qRCode = qRCode;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Integer getSearchType() {
		return searchType;
	}
	public void setSearchType(Integer searchType) {
		this.searchType = searchType;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getOrderRule() {
		return orderRule;
	}
	public void setOrderRule(String orderRule) {
		this.orderRule = orderRule;
	}
	public List<CourseEntity> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<CourseEntity> courseList) {
		this.courseList = courseList;
	}
	public boolean isDisplay() {
		return isDisplay;
	}
	public void setDisplay(boolean isDisplay) {
		this.isDisplay = isDisplay;
	}

	
	/*public String getStartTimeStr(){
		return DateTimeUtils.dateToStringNoSecond(this.startTime);
	}*/
	public List<String> getCitysList() {
		return citysList;
	}
	public void setCitysList(List<String> citysList) {
		this.citysList = citysList;
	}


	public Integer getIsUseLiveResource() {
		return isUseLiveResource;
	}

	public void setIsUseLiveResource(Integer isUseLiveResource) {
		this.isUseLiveResource = isUseLiveResource;
	}

	public Integer getIsUseVodResource() {
		return isUseVodResource;
	}

	public void setIsUseVodResource(Integer isUseVodResource) {
		this.isUseVodResource = isUseVodResource;
	}

	public Integer getIsUseOfflineResource() {
		return isUseOfflineResource;
	}

	public void setIsUseOfflineResource(Integer isUseOfflineResource) {
		this.isUseOfflineResource = isUseOfflineResource;
	}
	
	public Integer getIsUsePictureResource() {
		return isUsePictureResource;
	}
	public void setIsUsePictureResource(Integer isUsePictureResource) {
		this.isUsePictureResource = isUsePictureResource;
	}
	public List<String> getCategoryNameList() {
		return categoryNameList;
	}

	public void setCategoryNameList(List<String> categoryNameList) {
		this.categoryNameList = categoryNameList;
	}
	public List<Long> getDepartIds() {
		return departIds;
	}
	public void setDepartIds(List<Long> departIds) {
		this.departIds = departIds;
	}
	
	public String getVerifyUserName() {
		return verifyUserName;
	}
	public void setVerifyUserName(String verifyUserName) {
		this.verifyUserName = verifyUserName;
	}
	public String getLearnState() {
		return learnState;
	}
	public void setLearnState(String learnState) {
		this.learnState = learnState;
	}
	public Integer getIsPush() {
		return isPush;
	}
	public void setIsPush(Integer isPush) {
		this.isPush = isPush;
	}
	public String getVideoType() {
		return videoType;
	}
	public void setVideoType(String videoType) {
		this.videoType = videoType;
	}
	public String getEnterpriseName() {
		return enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}
	public Long getOrganId() {
		return organId;
	}
	public void setOrganId(Long organId) {
		this.organId = organId;
	}
	public String getOrganName() {
		return organName;
	}
	public void setOrganName(String organName) {
		this.organName = organName;
	}
	public Long getAdminUserId() {
		return adminUserId;
	}
	public void setAdminUserId(Long adminUserId) {
		this.adminUserId = adminUserId;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getOrganEnterpriseType() {
		return organEnterpriseType;
	}
	public void setOrganEnterpriseType(String organEnterpriseType) {
		this.organEnterpriseType = organEnterpriseType;
	}
	
	
}
