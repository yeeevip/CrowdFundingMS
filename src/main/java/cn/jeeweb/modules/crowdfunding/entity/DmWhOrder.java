package cn.jeeweb.modules.crowdfunding.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import cn.jeeweb.core.common.entity.AbstractEntity;
import java.util.Date;

/**   
 * @Title: 订单
 * @Description: 订单
 * @author jeeweb
 * @date 2017-10-12 10:13:33
 * @version V1.0   
 *
 */
@Entity
@Table(name = "porder")
@DynamicUpdate(false)
@DynamicInsert(false)
@SuppressWarnings("serial")
public class DmWhOrder extends AbstractEntity<Integer> {

    /**回报份数*/
	private Integer count;
    /**是否发货*/
	private Integer isSend;
    /**是否支付*/
	private Integer isPay;
    /**回报id*/
	//private Integer projectrepay;
    /**卖家id*/
	//private Integer userSeller;
    /**创建时间*/
	private Date orderDate;
    /**支付时间*/
	private Date payTime;
    /**订单idz主键*/
	private Integer id;
    /**项目id*/
	//private Integer project;
    /**下单用户*/
	//private Integer user;
    /**receive_information*/
	//private Integer receiveInformation;
	
	private Integer yxbz;
	
	
	private DmWhProject project;
	private DmWhUser sellUser;
	private DmWhUser buyUser;
	private DmWhProjectRepay projectRepay;
	private DmWhReceiveInfo receiveInfo;
	
	
	
	

	public Integer getYxbz() {
		return yxbz;
	}

	public void setYxbz(Integer yxbz) {
		this.yxbz = yxbz;
	}

	@ManyToOne
	@JoinColumn(name="receive_information")
	public DmWhReceiveInfo getReceiveInfo() {
		return receiveInfo;
	}

	public void setReceiveInfo(DmWhReceiveInfo receiveInfo) {
		this.receiveInfo = receiveInfo;
	}

	@ManyToOne
	@JoinColumn(name="project")
	public DmWhProject getProject() {
		return project;
	}

	public void setProject(DmWhProject project) {
		this.project = project;
	}

	@ManyToOne
	@JoinColumn(name="user_seller")
	public DmWhUser getSellUser() {
		return sellUser;
	}

	public void setSellUser(DmWhUser sellUser) {
		this.sellUser = sellUser;
	}

	@ManyToOne
	@JoinColumn(name="user")
	public DmWhUser getBuyUser() {
		return buyUser;
	}

	public void setBuyUser(DmWhUser buyUser) {
		this.buyUser = buyUser;
	}

	@ManyToOne
	@JoinColumn(name="projectrepay")
	public DmWhProjectRepay getProjectRepay() {
		return projectRepay;
	}

	public void setProjectRepay(DmWhProjectRepay projectRepay) {
		this.projectRepay = projectRepay;
	}
	
	
	
	
	
	
	
	

	/**
	 * 获取  count
	 *@return: Integer  回报份数
	 */
	@Column(name ="count",nullable=true,length=10,scale=0)
	public Integer getCount(){
		return this.count;
	}

	/**
	 * 设置  count
	 *@param: count  回报份数
	 */
	public void setCount(Integer count){
		this.count = count;
	}
	/**
	 * 获取  isSend
	 *@return: Integer  是否发货
	 */
	@Column(name ="is_send",nullable=true,length=10,scale=0)
	public Integer getIsSend(){
		return this.isSend;
	}

	/**
	 * 设置  isSend
	 *@param: isSend  是否发货
	 */
	public void setIsSend(Integer isSend){
		this.isSend = isSend;
	}
	/**
	 * 获取  isPay
	 *@return: Integer  是否支付
	 */
	@Column(name ="is_pay",nullable=true,length=10,scale=0)
	public Integer getIsPay(){
		return this.isPay;
	}

	/**
	 * 设置  isPay
	 *@param: isPay  是否支付
	 */
	public void setIsPay(Integer isPay){
		this.isPay = isPay;
	}
	/**
	 * 获取  projectrepay
	 *@return: Integer  回报id
	 */
//	@Column(name ="projectrepay",nullable=false,length=10,scale=0)
//	public Integer getProjectrepay(){
//		return this.projectrepay;
//	}

	/**
	 * 设置  projectrepay
	 *@param: projectrepay  回报id
	 */
//	public void setProjectrepay(Integer projectrepay){
//		this.projectrepay = projectrepay;
//	}
	/**
	 * 获取  userSeller
	 *@return: Integer  卖家id
	 */
//	@Column(name ="user_seller",nullable=true,length=10,scale=0)
//	public Integer getUserSeller(){
//		return this.userSeller;
//	}

	/**
	 * 设置  userSeller
	 *@param: userSeller  卖家id
	 */
//	public void setUserSeller(Integer userSeller){
//		this.userSeller = userSeller;
//	}
	/**
	 * 获取  orderDate
	 *@return: Date  创建时间
	 */
	@Column(name ="order_date",nullable=true,length=19,scale=0)
	public Date getOrderDate(){
		return this.orderDate;
	}

	/**
	 * 设置  orderDate
	 *@param: orderDate  创建时间
	 */
	public void setOrderDate(Date orderDate){
		this.orderDate = orderDate;
	}
	/**
	 * 获取  payTime
	 *@return: Date  支付时间
	 */
	@Column(name ="pay_time",nullable=true,length=19,scale=0)
	public Date getPayTime(){
		return this.payTime;
	}

	/**
	 * 设置  payTime
	 *@param: payTime  支付时间
	 */
	public void setPayTime(Date payTime){
		this.payTime = payTime;
	}
	/**
	 * 获取  id
	 *@return: Integer  订单idz主键
	 */
	
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="id",nullable=false,length=10,scale=0)
	public Integer getId(){
		return this.id;
	}

	/**
	 * 设置  id
	 *@param: id  订单idz主键
	 */
	public void setId(Integer id){
		this.id = id;
	}
	/**
	 * 获取  project
	 *@return: Integer  项目id
	 */
//	@Column(name ="project",nullable=false,length=10,scale=0)
//	public Integer getProject(){
//		return this.project;
//	}

	/**
	 * 设置  project
	 *@param: project  项目id
	 */
//	public void setProject(Integer project){
//		this.project = project;
//	}
	/**
	 * 获取  user
	 *@return: Integer  下单用户
	 */
//	@Column(name ="user",nullable=false,length=10,scale=0)
//	public Integer getUser(){
//		return this.user;
//	}

	/**
	 * 设置  user
	 *@param: user  下单用户
	 */
//	public void setUser(Integer user){
//		this.user = user;
//	}
	/**
	 * 获取  receiveInformation
	 *@return: Integer  receive_information
	 */
//	@Column(name ="receive_information",nullable=true,length=10,scale=0)
//	public Integer getReceiveInformation(){
//		return this.receiveInformation;
//	}

	/**
	 * 设置  receiveInformation
	 *@param: receiveInformation  receive_information
	 */
//	public void setReceiveInformation(Integer receiveInformation){
//		this.receiveInformation = receiveInformation;
//	}
	
}
