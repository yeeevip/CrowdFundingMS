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

/**   
 * @Title: 企业身份信息
 * @Description: 企业身份信息
 * @author quhailong
 * @date 2017-11-06 16:37:49
 * @version V1.0   
 *
 */
@Entity
@Table(name = "initiator_companyinfo")
@DynamicUpdate(false)
@DynamicInsert(false)
@SuppressWarnings("serial")
public class InitiatorCompanyinfo extends AbstractEntity<Integer> {

    /**licenesPic*/
	private String licenespic;
    /**slanderName*/
	private String slandername;
    /**taxPig*/
	private String taxpig;
    /**address*/
	private String address;
    /**businessNumber*/
	private String businessnumber;
    /**contactPhone*/
	private String contactphone;
    /**contactName*/
	private String contactname;
    /**firmName*/
	private String firmname;
    /**id*/
	private Integer id;
    /**project*/
	private Integer project;
    /**registeredNumPic*/
	private String registerednumpic;
	/**
	 * 获取  licenespic
	 *@return: String  licenesPic
	 */
	@Column(name ="licenespic",nullable=true,length=100,scale=0)
	public String getLicenespic(){
		return this.licenespic;
	}

	/**
	 * 设置  licenespic
	 *@param: licenespic  licenesPic
	 */
	public void setLicenespic(String licenespic){
		this.licenespic = licenespic;
	}
	/**
	 * 获取  slandername
	 *@return: String  slanderName
	 */
	@Column(name ="slandername",nullable=true,length=30,scale=0)
	public String getSlandername(){
		return this.slandername;
	}

	/**
	 * 设置  slandername
	 *@param: slandername  slanderName
	 */
	public void setSlandername(String slandername){
		this.slandername = slandername;
	}
	/**
	 * 获取  taxpig
	 *@return: String  taxPig
	 */
	@Column(name ="taxpig",nullable=true,length=100,scale=0)
	public String getTaxpig(){
		return this.taxpig;
	}

	/**
	 * 设置  taxpig
	 *@param: taxpig  taxPig
	 */
	public void setTaxpig(String taxpig){
		this.taxpig = taxpig;
	}
	/**
	 * 获取  address
	 *@return: String  address
	 */
	@Column(name ="address",nullable=true,length=200,scale=0)
	public String getAddress(){
		return this.address;
	}

	/**
	 * 设置  address
	 *@param: address  address
	 */
	public void setAddress(String address){
		this.address = address;
	}
	/**
	 * 获取  businessnumber
	 *@return: String  businessNumber
	 */
	@Column(name ="businessnumber",nullable=true,length=100,scale=0)
	public String getBusinessnumber(){
		return this.businessnumber;
	}

	/**
	 * 设置  businessnumber
	 *@param: businessnumber  businessNumber
	 */
	public void setBusinessnumber(String businessnumber){
		this.businessnumber = businessnumber;
	}
	/**
	 * 获取  contactphone
	 *@return: String  contactPhone
	 */
	@Column(name ="contactphone",nullable=true,length=50,scale=0)
	public String getContactphone(){
		return this.contactphone;
	}

	/**
	 * 设置  contactphone
	 *@param: contactphone  contactPhone
	 */
	public void setContactphone(String contactphone){
		this.contactphone = contactphone;
	}
	/**
	 * 获取  contactname
	 *@return: String  contactName
	 */
	@Column(name ="contactname",nullable=true,length=50,scale=0)
	public String getContactname(){
		return this.contactname;
	}

	/**
	 * 设置  contactname
	 *@param: contactname  contactName
	 */
	public void setContactname(String contactname){
		this.contactname = contactname;
	}
	/**
	 * 获取  firmname
	 *@return: String  firmName
	 */
	@Column(name ="firmname",nullable=true,length=50,scale=0)
	public String getFirmname(){
		return this.firmname;
	}

	/**
	 * 设置  firmname
	 *@param: firmname  firmName
	 */
	public void setFirmname(String firmname){
		this.firmname = firmname;
	}
	/**
	 * 获取  id
	 *@return: Integer  id
	 */
	@Column(name ="id",nullable=false,length=10,scale=0)
	public Integer getId(){
		return this.id;
	}

	/**
	 * 设置  id
	 *@param: id  id
	 */
	public void setId(Integer id){
		this.id = id;
	}
	/**
	 * 获取  project
	 *@return: Integer  project
	 */
	
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="project",nullable=false,length=10,scale=0)
	public Integer getProject(){
		return this.project;
	}

	/**
	 * 设置  project
	 *@param: project  project
	 */
	public void setProject(Integer project){
		this.project = project;
	}
	/**
	 * 获取  registerednumpic
	 *@return: String  registeredNumPic
	 */
	@Column(name ="registerednumpic",nullable=true,length=100,scale=0)
	public String getRegisterednumpic(){
		return this.registerednumpic;
	}

	/**
	 * 设置  registerednumpic
	 *@param: registerednumpic  registeredNumPic
	 */
	public void setRegisterednumpic(String registerednumpic){
		this.registerednumpic = registerednumpic;
	}
	
}
