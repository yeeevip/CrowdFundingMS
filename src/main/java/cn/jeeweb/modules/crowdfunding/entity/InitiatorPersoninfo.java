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
 * @Title: 个人身份信息
 * @Description: 个人身份信息
 * @author quhailong
 * @date 2017-11-06 16:40:53
 * @version V1.0   
 *
 */
@Entity
@Table(name = "initiator_personinfo")
@DynamicUpdate(false)
@DynamicInsert(false)
@SuppressWarnings("serial")
public class InitiatorPersoninfo extends AbstractEntity<Integer> {

    /**address*/
	private String address;
    /**phone*/
	private String phone;
    /**IDpicInverse*/
	private String idpicinverse;
    /**name*/
	private String name;
    /**IDpicFace*/
	private String idpicface;
    /**project*/
	private Integer project;
    /**id*/
	private Integer id;
    /**IDnumber*/
	private String idnumber;
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
	 * 获取  phone
	 *@return: String  phone
	 */
	@Column(name ="phone",nullable=true,length=30,scale=0)
	public String getPhone(){
		return this.phone;
	}

	/**
	 * 设置  phone
	 *@param: phone  phone
	 */
	public void setPhone(String phone){
		this.phone = phone;
	}
	/**
	 * 获取  idpicinverse
	 *@return: String  IDpicInverse
	 */
	@Column(name ="idpicinverse",nullable=true,length=200,scale=0)
	public String getIdpicinverse(){
		return this.idpicinverse;
	}

	/**
	 * 设置  idpicinverse
	 *@param: idpicinverse  IDpicInverse
	 */
	public void setIdpicinverse(String idpicinverse){
		this.idpicinverse = idpicinverse;
	}
	/**
	 * 获取  name
	 *@return: String  name
	 */
	@Column(name ="name",nullable=true,length=30,scale=0)
	public String getName(){
		return this.name;
	}

	/**
	 * 设置  name
	 *@param: name  name
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 * 获取  idpicface
	 *@return: String  IDpicFace
	 */
	@Column(name ="idpicface",nullable=true,length=200,scale=0)
	public String getIdpicface(){
		return this.idpicface;
	}

	/**
	 * 设置  idpicface
	 *@param: idpicface  IDpicFace
	 */
	public void setIdpicface(String idpicface){
		this.idpicface = idpicface;
	}
	/**
	 * 获取  project
	 *@return: Integer  project
	 */
	
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@JoinColumn(name = "project")
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
	 * 获取  idnumber
	 *@return: String  IDnumber
	 */
	@Column(name ="idnumber",nullable=true,length=50,scale=0)
	public String getIdnumber(){
		return this.idnumber;
	}

	/**
	 * 设置  idnumber
	 *@param: idnumber  IDnumber
	 */
	public void setIdnumber(String idnumber){
		this.idnumber = idnumber;
	}
	
}
