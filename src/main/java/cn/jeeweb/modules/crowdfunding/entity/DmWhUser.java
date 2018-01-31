package cn.jeeweb.modules.crowdfunding.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import com.alibaba.fastjson.annotation.JSONField;

import cn.jeeweb.core.common.entity.AbstractEntity;

import java.util.Date;

/**   
 * @Title: 众筹 用户
 * @Description: 众筹 用户
 * @author quhailong
 * @date 2017-10-10 11:20:01
 * @version V1.0   
 *
 */
@Entity
@Table(name = "user")
@DynamicUpdate(false)
@DynamicInsert(false)
@SuppressWarnings("serial")
public class DmWhUser extends AbstractEntity<Integer> {

    /**用户id主键*/
	private Integer id;
    /**出生日期*/
	private String dateOfBirth;
    /**电话号码*/
	private String phone;
    /**电子邮箱*/
	private String email;
    /**密码*/
	private String password;
    /**真实姓名*/
	private String realName;
    /**城市*/
	private String city;
    /**身份证号*/
	private String idNumber;
    /**用户名*/
	private String userName;
    /**img_path*/
	private String imgPath;
    /**性别*/
	private String sex;
    /**注册时间*/
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date dateOfRegistration;
	/**
	 * 获取  id
	 *@return: Integer  用户id主键
	 */
	
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "increment")
	@Column(name ="id",nullable=false,length=10,scale=0)
	public Integer getId(){
		return this.id;
	}

	/**
	 * 设置  id
	 *@param: id  用户id主键
	 */
	public void setId(Integer id){
		this.id = id;
	}
	/**
	 * 获取  dateOfBirth
	 *@return: String  出生日期
	 */
	@Column(name ="date_of_birth",nullable=true,length=10,scale=0)
	public String getDateOfBirth(){
		return this.dateOfBirth;
	}

	/**
	 * 设置  dateOfBirth
	 *@param: dateOfBirth  出生日期
	 */
	public void setDateOfBirth(String dateOfBirth){
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * 获取  phone
	 *@return: String  电话号码
	 */
	@Column(name ="phone",nullable=true,length=11,scale=0)
	public String getPhone(){
		return this.phone;
	}

	/**
	 * 设置  phone
	 *@param: phone  电话号码
	 */
	public void setPhone(String phone){
		this.phone = phone;
	}
	/**
	 * 获取  email
	 *@return: String  电子邮箱
	 */
	@Column(name ="email",nullable=true,length=50,scale=0)
	public String getEmail(){
		return this.email;
	}

	/**
	 * 设置  email
	 *@param: email  电子邮箱
	 */
	public void setEmail(String email){
		this.email = email;
	}
	/**
	 * 获取  password
	 *@return: String  密码
	 */
	@Column(name ="password",nullable=false,length=50,scale=0)
	public String getPassword(){
		return this.password;
	}

	/**
	 * 设置  password
	 *@param: password  密码
	 */
	public void setPassword(String password){
		this.password = password;
	}
	/**
	 * 获取  realName
	 *@return: String  真实姓名
	 */
	@Column(name ="real_name",nullable=true,length=20,scale=0)
	public String getRealName(){
		return this.realName;
	}

	/**
	 * 设置  realName
	 *@param: realName  真实姓名
	 */
	public void setRealName(String realName){
		this.realName = realName;
	}
	/**
	 * 获取  city
	 *@return: String  城市
	 */
	@Column(name ="city",nullable=true,length=14,scale=0)
	public String getCity(){
		return this.city;
	}

	/**
	 * 设置  city
	 *@param: city  城市
	 */
	public void setCity(String city){
		this.city = city;
	}
	/**
	 * 获取  idNumber
	 *@return: String  身份证号
	 */
	@Column(name ="id_number",nullable=true,length=18,scale=0)
	public String getIdNumber(){
		return this.idNumber;
	}

	/**
	 * 设置  idNumber
	 *@param: idNumber  身份证号
	 */
	public void setIdNumber(String idNumber){
		this.idNumber = idNumber;
	}
	/**
	 * 获取  userName
	 *@return: String  用户名
	 */
	@Column(name ="user_name",nullable=true,length=20,scale=0)
	public String getUserName(){
		return this.userName;
	}

	/**
	 * 设置  userName
	 *@param: userName  用户名
	 */
	public void setUserName(String userName){
		this.userName = userName;
	}
	/**
	 * 获取  imgPath
	 *@return: String  img_path
	 */
	@Column(name ="img_path",nullable=true,length=30,scale=0)
	public String getImgPath(){
		return this.imgPath;
	}

	/**
	 * 设置  imgPath
	 *@param: imgPath  img_path
	 */
	public void setImgPath(String imgPath){
		this.imgPath = imgPath;
	}
	/**
	 * 获取  sex
	 *@return: String  性别
	 */
	@Column(name ="sex",nullable=true,length=2,scale=0)
	public String getSex(){
		return this.sex;
	}

	/**
	 * 设置  sex
	 *@param: sex  性别
	 */
	public void setSex(String sex){
		this.sex = sex;
	}
	/**
	 * 获取  dateOfRegistration
	 *@return: Date  注册时间
	 */
	@Column(name ="date_of_registration",nullable=true,length=19,scale=0)
	public Date getDateOfRegistration(){
		return this.dateOfRegistration;
	}

	/**
	 * 设置  dateOfRegistration
	 *@param: dateOfRegistration  注册时间
	 */
	public void setDateOfRegistration(Date dateOfRegistration){
		this.dateOfRegistration = dateOfRegistration;
	}
	
}
