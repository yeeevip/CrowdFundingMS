package cn.jeeweb.modules.crowdfunding.entity;


/**   
 * @Title: 统计
 * @Description: 统计
 * @author QuHaiLong
 * @date 2017-09-08 14:51:23
 * @version V1.0   
 *
 */
public class Statistics {
	private String sDate;
	private String sHour;
	private Integer count;
	public String getsDate() {
		return sDate;
	}
	public void setsDate(String sDate) {
		this.sDate = sDate;
	}
	public String getsHour() {
		return sHour;
	}
	public void setsHour(String sHour) {
		this.sHour = sHour;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Statistics [sDate=" + sDate + ", sHour=" + sHour + ", count="
				+ count + "]";
	}
	
	
	

}
