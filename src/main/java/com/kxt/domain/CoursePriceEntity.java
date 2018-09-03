package com.kxt.domain;

import java.math.BigDecimal;
import java.util.List;

/**
 * 课程价格
 * @author txs
 *
 */
public class CoursePriceEntity {

	private Long id;//ID
	private String courseId;//课程ID
	  /**
     * 平台类型：ORG(机构)，ENTERPRISE （学习平台和好班掌）
     */
    private String enterpriseType;
    
    private Long enterpriseId;//平台ID
    
    private String enterStr;//平台id,逗号分隔
    
    private String modifiedPrice;//多价格，页面展示
    
    public String getEnterStr() {
		return enterStr;
	}

	public void setEnterStr(String enterStr) {
		this.enterStr = enterStr;
	}

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
    
    private Long referId;//关联ID
    
    private String referType;//可选 关联类型  DEPARTMENT（用户组），ENTERPRISE 学习平台
    /**
   	 * 关联类型
   	 * @author Administrator
   	 *
   	 */
       public enum ReferType {
    	   DEPARTMENT("用户组"),
    	   ENTERPRISE("学习平台"),
    	   ORG("机构");
           private String text;

           ReferType(String text) {
               this.text = text;
           }

           public String getText() {
               return text;
           }
       }
       
       private BigDecimal distributePrice;//可选  分发价格,佣金结算价格
       
       private BigDecimal sellPrice;//平台或学习小组 实际售价
       
       private List<Long> idList;//查询条件，平台id集合

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

	public String getEnterpriseType() {
		return enterpriseType;
	}

	public void setEnterpriseType(String enterpriseType) {
		this.enterpriseType = enterpriseType;
	}

	public Long getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(Long enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public Long getReferId() {
		return referId;
	}

	public void setReferId(Long referId) {
		this.referId = referId;
	}

	public String getReferType() {
		return referType;
	}

	public void setReferType(String referType) {
		this.referType = referType;
	}

	public BigDecimal getDistributePrice() {
		return distributePrice;
	}

	public void setDistributePrice(BigDecimal distributePrice) {
		this.distributePrice = distributePrice;
	}

	public BigDecimal getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}

	public List<Long> getIdList() {
		return idList;
	}

	public void setIdList(List<Long> idList) {
		this.idList = idList;
	}

	public String getModifiedPrice() {
		return modifiedPrice;
	}

	public void setModifiedPrice(String modifiedPrice) {
		this.modifiedPrice = modifiedPrice;
	}
       
       
       
}
