package cn.jeeweb.modules.crowdfunding.utils;

import org.apache.log4j.Logger;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource {

	/**
	  * 注意：数据源标识保存在线程变量中，避免多线程操作数据源时互相干扰
	  */
	private static final ThreadLocal<String> THREAD_DATA_SOURCE = new ThreadLocal<String>();
	protected final Logger logger = Logger.getLogger(this.getClass());
	
	
	@Override
	protected Object determineCurrentLookupKey() {
		// 从自定义的位置获取数据源标识
		logger.info("AbstractRoutingDataSource执行");
		return getDataSource();
	}
	


	public static String getDataSource() {
		return THREAD_DATA_SOURCE.get();
	}

	public static void setDataSource(String dataSource) {
		THREAD_DATA_SOURCE.set(dataSource);
	}

	public static void clearDataSource() {
		THREAD_DATA_SOURCE.remove();
	}


}
