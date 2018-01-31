package cn.jeeweb.modules.crowdfunding.utils;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class AspectUtil {
	
	protected final static Logger logger = Logger.getLogger(AspectUtil.class);
	
	@Pointcut("@annotation(cn.jeeweb.modules.crowdfunding.utils.DataSource)")    
    public  void dataSourceAspect(){}
	
	
	@Before(value="dataSourceAspect()&&@annotation(DataSource)")
	public void dobefore(JoinPoint joinPoint){
		logger.info("???????????????????????????-"+joinPoint.getTarget().getClass());
		DynamicDataSource.setDataSource("db_cf");
	}

}
