package cn.jeeweb.modules.crowdfunding.dao;

import java.util.List;

import cn.jeeweb.modules.crowdfunding.entity.Statistics;


/**   
 * @Title: 统计
 * @Description: 统计
 * @author QuHaiLong
 * @date 2017-09-08 14:42:37
 * @version V1.0   
 *
 */
public interface StatisticsDao {
	
	/**
	 * 
	 * @description :  项目交易
	 * @author  	: QuHaiLong
	 * @date		: 2017年9月11日 上午10:51:43
	 * @param projectType 项目类别
	 * @param sType 统计方式 年月日
	 * @return	
	 *
	 */
	List<Statistics> projectTransactionStatistics(String projectType,  String sType );
	/**
	 * 
	 * @description :  用户注册统计
	 * @author  	: QuHaiLong
	 * @date		: 2017年9月13日 上午10:08:22
	 * @return	
	 *
	 */
	List<Statistics> userRegisterStatistics();
	/**
	 * 
	 * @description :  项目发起统计
	 * @author  	: QuHaiLong
	 * @date		: 2017年9月13日 上午10:11:49
	 * @param projectType 项目类型
	 * @return	
	 *
	 */
	List<Statistics> projectLaunchStatistics(String projectType);

}
