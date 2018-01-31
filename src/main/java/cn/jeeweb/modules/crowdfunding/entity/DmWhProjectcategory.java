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
 * @Title: 项目分类
 * @Description: 项目分类
 * @author jeeweb
 * @date 2017-10-12 10:15:19
 * @version V1.0   
 *
 */
@Entity
@Table(name = "projectcategory")
@DynamicUpdate(false)
@DynamicInsert(false)
@SuppressWarnings("serial")
public class DmWhProjectcategory extends AbstractEntity<Integer> {

    /**change_date*/
	private Date changeDate;
    /**id*/
	private Integer id;
    /**change_person*/
	private String changePerson;
    /**note*/
	private String note;
    /**create_date*/
	private Date createDate;
    /**category_name*/
	private String categoryName;
	/**
	 * 获取  changeDate
	 *@return: Date  change_date
	 */
	@Column(name ="change_date",nullable=true,length=19,scale=0)
	public Date getChangeDate(){
		return this.changeDate;
	}

	/**
	 * 设置  changeDate
	 *@param: changeDate  change_date
	 */
	public void setChangeDate(Date changeDate){
		this.changeDate = changeDate;
	}
	/**
	 * 获取  id
	 *@return: Integer  id
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
	 *@param: id  id
	 */
	public void setId(Integer id){
		this.id = id;
	}
	/**
	 * 获取  changePerson
	 *@return: String  change_person
	 */
	@Column(name ="change_person",nullable=true,length=10,scale=0)
	public String getChangePerson(){
		return this.changePerson;
	}

	/**
	 * 设置  changePerson
	 *@param: changePerson  change_person
	 */
	public void setChangePerson(String changePerson){
		this.changePerson = changePerson;
	}
	/**
	 * 获取  note
	 *@return: String  note
	 */
	@Column(name ="note",nullable=true,length=50,scale=0)
	public String getNote(){
		return this.note;
	}

	/**
	 * 设置  note
	 *@param: note  note
	 */
	public void setNote(String note){
		this.note = note;
	}
	/**
	 * 获取  createDate
	 *@return: Date  create_date
	 */
	@Column(name ="create_date",nullable=true,length=19,scale=0)
	public Date getCreateDate(){
		return this.createDate;
	}

	/**
	 * 设置  createDate
	 *@param: createDate  create_date
	 */
	public void setCreateDate(Date createDate){
		this.createDate = createDate;
	}
	/**
	 * 获取  categoryName
	 *@return: String  category_name
	 */
	@Column(name ="category_name",nullable=true,length=10,scale=0)
	public String getCategoryName(){
		return this.categoryName;
	}

	/**
	 * 设置  categoryName
	 *@param: categoryName  category_name
	 */
	public void setCategoryName(String categoryName){
		this.categoryName = categoryName;
	}
	
}
