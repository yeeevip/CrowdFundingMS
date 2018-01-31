package cn.jeeweb.modules.crowdfunding.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import cn.jeeweb.core.common.entity.AbstractEntity;

import java.util.Date;

/**   
 * @Title: 众筹项目
 * @Description: 众筹项目
 * @author jeeweb
 * @date 2017-10-10 11:50:17
 * @version V1.0   
 *
 */
@Entity
@Table(name = "project")
@DynamicUpdate(false)
@DynamicInsert(false)
@SuppressWarnings("serial")
public class DmWhProject extends AbstractEntity<Integer> {

    /**项目产品主键id*/
	private Integer id;
    /**has_fund_raising*/
	private Integer hasFundRaising;
    /**是否首页展示*/
	private Integer isIndex;
    /**user_id*/
	//private Integer userId;
    /**days_raising*/
	private Integer daysRaising;
    /**项目状态 0：进行中  -1：集资失败 1：成功*/
	private Integer isFinish;
    /**title*/
	private String title;
    /**img_name*/
	private String imgName;
    /**category_id*/
	
	private Integer categoryId;
    /**-1:审核不通过 0:未审核 1:审核通过*/
	private Integer isAudits;
    /**total_fund_raising*/
	private Integer totalFundRaising;
    /**shenfen*/
	private String shenfen;
    /**blurb*/
	private String blurb;
    /**launch_date_raising*/
	private Date launchDateRaising;
	
	private Date queryStartDate;
	private Date queryEndDate;
	
	
	
	
	
	
	
	@Transient
	public Date getQueryStartDate() {
		return queryStartDate;
	}


	public void setQueryStartDate(Date queryStartDate) {
		this.queryStartDate = queryStartDate;
	}

	@Transient
	public Date getQueryEndDate() {
		return queryEndDate;
	}


	public void setQueryEndDate(Date queryEndDate) {
		this.queryEndDate = queryEndDate;
	}

	private DmWhUser user;
	private DmWhProjectcategory projectcategory;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	public DmWhUser getUser() {
		return user;
	}
	
	
	@ManyToOne
	@JoinColumn(name="category_id")
	public DmWhProjectcategory getProjectcategory() {
		return projectcategory;
	}



	public void setProjectcategory(DmWhProjectcategory projectcategory) {
		this.projectcategory = projectcategory;
	}



	public void setUser(DmWhUser user) {
		this.user = user;
	}

	/**
	 * 获取  projectId
	 *@return: Integer  项目产品主键id
	 */
	
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "assigned")
	@Column(name ="project_id",nullable=false,length=10,scale=0)
	public Integer getId(){
		return this.id;
	}

	/**
	 * 设置  projectId
	 *@param: projectId  项目产品主键id
	 */
	public void setId(Integer id){
		this.id = id;
	}
	/**
	 * 获取  hasFundRaising
	 *@return: Integer  has_fund_raising
	 */
	@Column(name ="has_fund_raising",nullable=true,length=10,scale=0)
	public Integer getHasFundRaising(){
		return this.hasFundRaising;
	}

	/**
	 * 设置  hasFundRaising
	 *@param: hasFundRaising  has_fund_raising
	 */
	public void setHasFundRaising(Integer hasFundRaising){
		this.hasFundRaising = hasFundRaising;
	}
	/**
	 * 获取  isIndex
	 *@return: Integer  是否首页展示
	 */
	@Column(name ="is_index",nullable=true,length=10,scale=0)
	public Integer getIsIndex(){
		return this.isIndex;
	}

	/**
	 * 设置  isIndex
	 *@param: isIndex  是否首页展示
	 */
	public void setIsIndex(Integer isIndex){
		this.isIndex = isIndex;
	}
	/**
	 * 获取  userId
	 *@return: Integer  user_id
	 */
//	@Column(name ="user_id",nullable=true,length=10,scale=0)
//	public Integer getUserId(){
//		return this.userId;
//	}

	/**
	 * 设置  userId
	 *@param: userId  user_id
	 */
//	public void setUserId(Integer userId){
//		this.userId = userId;
//	}
	/**
	 * 获取  daysRaising
	 *@return: Integer  days_raising
	 */
	@Column(name ="days_raising",nullable=true,length=10,scale=0)
	public Integer getDaysRaising(){
		return this.daysRaising;
	}

	/**
	 * 设置  daysRaising
	 *@param: daysRaising  days_raising
	 */
	public void setDaysRaising(Integer daysRaising){
		this.daysRaising = daysRaising;
	}
	/**
	 * 获取  isFinish
	 *@return: Integer  项目状态 0：进行中  -1：集资失败 1：成功
	 */
	@Column(name ="is_finish",nullable=true,length=10,scale=0)
	public Integer getIsFinish(){
		return this.isFinish;
	}

	/**
	 * 设置  isFinish
	 *@param: isFinish  项目状态 0：进行中  -1：集资失败 1：成功
	 */
	public void setIsFinish(Integer isFinish){
		this.isFinish = isFinish;
	}
	/**
	 * 获取  title
	 *@return: String  title
	 */
	@Column(name ="title",nullable=true,length=50,scale=0)
	public String getTitle(){
		return this.title;
	}

	/**
	 * 设置  title
	 *@param: title  title
	 */
	public void setTitle(String title){
		this.title = title;
	}
	/**
	 * 获取  imgName
	 *@return: String  img_name
	 */
	@Column(name ="img_name",nullable=true,length=200,scale=0)
	public String getImgName(){
		return this.imgName;
	}

	/**
	 * 设置  imgName
	 *@param: imgName  img_name
	 */
	public void setImgName(String imgName){
		this.imgName = imgName;
	}
	/**
	 * 获取  categoryId
	 *@return: Integer  category_id
	 */
//	@Column(name ="category_id",nullable=true,length=10,scale=0)
	@Transient
	public Integer getCategoryId(){
		return this.categoryId;
	}

	/**
	 * 设置  categoryId
	 *@param: categoryId  category_id
	 */
	public void setCategoryId(Integer categoryId){
		this.categoryId = categoryId;
	}
	/**
	 * 获取  isAudits
	 *@return: Integer  -1:审核不通过 0:未审核 1:审核通过
	 */
	@Column(name ="is_audits",nullable=true,length=10,scale=0)
	public Integer getIsAudits(){
		return this.isAudits;
	}

	/**
	 * 设置  isAudits
	 *@param: isAudits  -1:审核不通过 0:未审核 1:审核通过
	 */
	public void setIsAudits(Integer isAudits){
		this.isAudits = isAudits;
	}
	/**
	 * 获取  totalFundRaising
	 *@return: Integer  total_fund_raising
	 */
	@Column(name ="total_fund_raising",nullable=true,length=10,scale=0)
	public Integer getTotalFundRaising(){
		return this.totalFundRaising;
	}

	/**
	 * 设置  totalFundRaising
	 *@param: totalFundRaising  total_fund_raising
	 */
	public void setTotalFundRaising(Integer totalFundRaising){
		this.totalFundRaising = totalFundRaising;
	}
	/**
	 * 获取  shenfen
	 *@return: String  shenfen
	 */
	@Column(name ="shenfen",nullable=true,length=4,scale=0)
	public String getShenfen(){
		return this.shenfen;
	}

	/**
	 * 设置  shenfen
	 *@param: shenfen  shenfen
	 */
	public void setShenfen(String shenfen){
		this.shenfen = shenfen;
	}
	/**
	 * 获取  blurb
	 *@return: String  blurb
	 */
	@Column(name ="blurb",nullable=true,length=200,scale=0)
	public String getBlurb(){
		return this.blurb;
	}

	/**
	 * 设置  blurb
	 *@param: blurb  blurb
	 */
	public void setBlurb(String blurb){
		this.blurb = blurb;
	}
	/**
	 * 获取  launchDateRaising
	 *@return: Date  launch_date_raising
	 */
	@Column(name ="launch_date_raising",nullable=true,length=19,scale=0)
	public Date getLaunchDateRaising(){
		return this.launchDateRaising;
	}

	/**
	 * 设置  launchDateRaising
	 *@param: launchDateRaising  launch_date_raising
	 */
	public void setLaunchDateRaising(Date launchDateRaising){
		this.launchDateRaising = launchDateRaising;
	}
	
}
