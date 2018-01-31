package cn.jeeweb.modules.crowdfunding.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import cn.jeeweb.core.common.entity.AbstractEntity;

@Entity
@Table(name = "projectrepay")
@DynamicUpdate(false)
@DynamicInsert(false)
@SuppressWarnings("serial")
public class DmWhProjectRepay  extends AbstractEntity<Integer>{
	
	private Integer id;
	private Integer projctId;
	private String payTitle;
	private String payContent;
	private String type;
	private Integer time;
	private Integer money;
	
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
	
	@Column(name ="project_id")
	public Integer getProjctId() {
		return projctId;
	}
	public void setProjctId(Integer projctId) {
		this.projctId = projctId;
	}
	@Column(name ="paytitle")
	public String getPayTitle() {
		return payTitle;
	}
	public void setPayTitle(String payTitle) {
		this.payTitle = payTitle;
	}
	@Column(name ="paycontent")
	public String getPayContent() {
		return payContent;
	}
	public void setPayContent(String payContent) {
		this.payContent = payContent;
	}
	@Column(name ="type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Column(name ="time")
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	@Column(name ="money")
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	
	
	

}
