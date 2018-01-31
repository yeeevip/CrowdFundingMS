package cn.jeeweb.modules.crowdfunding.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import cn.jeeweb.core.common.entity.AbstractEntity;

@Entity
@Table(name = "receive_information")
@DynamicUpdate(false)
@DynamicInsert(false)
@SuppressWarnings("serial")
public class DmWhReceiveInfo  extends AbstractEntity<Integer>{
	
	private Integer id;
	private Integer userId;
	private String phone;
	private String address;
	private String receiver;
	private String completeInfo;
	
	
	
	
	
	
	@Transient
	public String getCompleteInfo() {
		String tempStr = "";
		tempStr = "收件人:"+receiver+"，手机:"+phone+"，地址:"+address;
		return tempStr;
	}

	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="id",nullable=false,length=10,scale=0)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name ="user")
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	@Column(name ="phone")
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Column(name ="address")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name ="receiver")
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	
	
	
	

}
