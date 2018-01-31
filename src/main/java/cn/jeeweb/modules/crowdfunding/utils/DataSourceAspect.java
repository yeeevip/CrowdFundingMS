package cn.jeeweb.modules.crowdfunding.utils;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;



public class DataSourceAspect{
	/**
	 * 拦截目标方法，获取由@DataSource指定的数据源标识，设置到线程存储中以便切换数据源
	 * 
	 * @param point
	 * @throws Exception
	 */
	
	protected final Logger logger = Logger.getLogger(this.getClass());
	
	
	public void intercept(JoinPoint point) throws Exception {
		Class<?> target = point.getTarget().getClass();
		MethodSignature signature = (MethodSignature) point.getSignature();
		// 默认使用目标类型的注解，如果没有则使用其实现接口的注解
		for (Class<?> clazz : target.getInterfaces()) {
			resolveDataSource(clazz, signature.getMethod());
		}
		
		logger.info("已拦截"+target+"类，方法名为"+signature.getMethod());
		resolveDataSource(target,signature.getMethod());
	}
	
	/**
	 * 恢复默认数据源
	 */
	
	public void recoveryDefaultDB(JoinPoint point){
		Class<?> target = point.getTarget().getClass();
		MethodSignature signature = (MethodSignature) point.getSignature();
		logger.info(target+"类，方法名为"+signature.getMethod()+"已经执行完");
		DynamicDataSource.setDataSource("db_sys");
		logger.info("数据源已经恢复为默认");
		
	}
	

	/**
	 * 提取目标对象方法注解和类型注解中的数据源标识
	 * 
	 * @param clazz
	 * @param method
	 */
	private void resolveDataSource(Class<?> clazz ,Method method) {
		try {
			Class<?>[] types = method.getParameterTypes();
			// 默认使用类型注解
			if (clazz.isAnnotationPresent(DataSource.class)) {
				DataSource source = clazz.getAnnotation(DataSource.class);
				DynamicDataSource.setDataSource(source.value());
				logger.info("数据源已经切换为："+DynamicDataSource.getDataSource());
			}
			// 方法注解可以覆盖类型注解
			Method m = clazz.getMethod(method.getName(), types);
			if (m != null && m.isAnnotationPresent(DataSource.class)) {
				DataSource source = m.getAnnotation(DataSource.class);
				DynamicDataSource.setDataSource(source.value());
				//PrvncUtil.setDataSourceName(source.value());
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.info(clazz + ":" + e.getMessage());
		}
	}


}
