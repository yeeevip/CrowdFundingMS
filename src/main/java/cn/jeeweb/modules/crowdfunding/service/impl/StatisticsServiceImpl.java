package cn.jeeweb.modules.crowdfunding.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.crowdfunding.dao.StatisticsDao;
import cn.jeeweb.modules.crowdfunding.dao.impl.StatisticsDaoImpl;
import cn.jeeweb.modules.crowdfunding.entity.DmWhUser;
import cn.jeeweb.modules.crowdfunding.entity.Statistics;
import cn.jeeweb.modules.crowdfunding.service.IStatisticsService;
import cn.jeeweb.modules.crowdfunding.utils.DataSource;

@Transactional(propagation = Propagation.SUPPORTS)
@Service("statisticsService")
@DataSource("db_cf")
public class StatisticsServiceImpl  implements IStatisticsService {
	
	private StatisticsDaoImpl statisticsMapper = new StatisticsDaoImpl() ;

	
	
	
	
	
	@Override
	public Integer[] statisticsByHourOrDay(String projectType, String sType) {
		// TODO Auto-generated method stub
		List<Statistics> statisticsList = null;
		//System.out.println("()()("+sType+serviceName);
		if(sType.equals("hour")){
			Integer[] countArray = {0,0,0,0,0,0,
							   		0,0,0,0,0,0,
							   		0,0,0,0,0,0,
							   		0,0,0,0,0,0};
			statisticsList = statisticsMapper.projectTransactionStatistics(projectType, sType);
			for(Statistics s : statisticsList ){
				if(s.getsHour()!=null){
					countArray[Integer.parseInt(s.getsHour())] = s.getCount();
				}
			
			}
			return countArray;
		}
		
		if(sType.equals("day")){
			 
			Integer[] countArray = {0,0,0,0,0,0,
							   		0,0,0,0,0,0,
							   		0,0,0,0,0,0,
							   		0,0,0,0,0,0,
							   		0,0,0,0,0,0,0};
			statisticsList = statisticsMapper.projectTransactionStatistics(projectType, sType);
			for(Statistics s : statisticsList ){
			countArray[Integer.parseInt(s.getsDate().split(" ")[0].split("-")[2])-1] = s.getCount();
			//System.out.println(s.getsDate()+"()()()()"+Integer.parseInt(s.getsDate().split(" ")[0].split("-")[2])+"()()()()"+s.getCount());
			}
			return countArray;
		}
		return null;
	}

	@Override
	public Integer[] userRegisterStatistics() {
		// TODO Auto-generated method stub
		Integer[] countArray = {0,0,0,0,0,0,
						   		0,0,0,0,0,0,
						   		0,0,0,0,0,0,
						   		0,0,0,0,0,0,
						   		0,0,0,0,0,0,0};
		List<Statistics> statisticsList = statisticsMapper.userRegisterStatistics();
		for(Statistics s : statisticsList ){
			countArray[Integer.parseInt(s.getsDate().split(" ")[0].split("-")[2])-1] = s.getCount();
			}
		return countArray;
	}

	@Override
	public Integer[] projectLaunchStatistics(String projectType) {
		// TODO Auto-generated method stub
		Integer[] countArray = {0,0,0,0,0,0,
						   		0,0,0,0,0,0,
						   		0,0,0,0,0,0,
						   		0,0,0,0,0,0,
						   		0,0,0,0,0,0,0};
		List<Statistics> statisticsList = statisticsMapper.projectLaunchStatistics(projectType);
		for(Statistics s : statisticsList ){
		countArray[Integer.parseInt(s.getsDate().split(" ")[0].split("-")[2])-1] = s.getCount();
		}
		return countArray;
	}



}
