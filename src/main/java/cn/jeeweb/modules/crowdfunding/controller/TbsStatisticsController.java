package cn.jeeweb.modules.crowdfunding.controller;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSON;

import cn.jeeweb.core.common.controller.BaseController;
import cn.jeeweb.modules.crowdfunding.service.IDmWhProjectcategoryService;
import cn.jeeweb.modules.crowdfunding.service.IStatisticsService;



/**   
 * @Title: 
 * @Description: 图表统计控制层
 * @author QuHaiLong
 * @date 2017-08-31 15:53:25
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("${admin.url.prefix}/crowdfunding/statistics")
public class TbsStatisticsController extends BaseController{

	@Autowired
	private IStatisticsService statisticsService;
	@Autowired
	private IDmWhProjectcategoryService dmWhProjectcategoryService;
	

	
	@RequestMapping(value="projectTransactionStatistics/{projectType}/{sType}")
	public void getTradeByService(@PathVariable(value="projectType")String projectType , @PathVariable(value="sType")String sType , HttpServletResponse response) throws IOException{
		
		//System.out.println(serviceName+"*()("+sType+"()()()()"+sType);
		//Integer[] countArray= statisticsService.statisticsByHourOrDay(projectType, sType);
		
		Integer[] countArray= { 10,30,80,100,70,90,
						   		40,30,200,150,60,0,
						   		88,33,66,44,0,0,
						   		0,44,55,89,23,0,
						   		45,56,200,210,78,0,0};
		
		response.getWriter().print(JSON.toJSONString(countArray));
	}
	
	@RequestMapping(value="userRegisterStatistics")
	public void getUserLoanCount( HttpServletResponse response) throws IOException{
		//Integer[] countArray= statisticsService.userRegisterStatistics();
		Integer[] countArray= { 10,30,80,100,70,90,
						   		40,30,200,150,60,0,
						   		88,33,66,44,0,0,
						   		0,44,55,89,23,0,
						   		45,56,200,210,78,0,0};
		response.getWriter().print(JSON.toJSONString(countArray));
	}
	
	
	@RequestMapping(value="projectCountByTypeStatistics/{projectType}")
	public void getOneUserLoanCount(@PathVariable("projectType")String projectType , HttpServletResponse response) throws IOException{
		
//		DmWhChannel dmWhChannel = dmWhChannelService.selectOne(new EntityWrapper<DmWhChannel>().eq("channel_name", channelName));
//		String channelId;
//		if(dmWhChannel!=null){
//			channelId = dmWhChannel.getId();
//		}else{
//			channelId = "";
//		}
		
		
		//Integer[] countArray= statisticsService.userLoanStatistics(channelId);
		Integer[] countArray={ 1,3,8,10,7,9,
						   		4,3,20,15,6,0,
						   		8,3,6,4,0,0,
						   		0,4,5,8,3,0,
						   		4,5,20,21,8,0,0};

		response.getWriter().print(JSON.toJSONString(countArray));
	}
	
	/*
	
	@RequestMapping(value="getAuthUserStatistics")
	public void getAuthUserCount(HttpServletResponse response,@RequestParam(value = "channelName", required = false)String channelName ) throws IOException{
		
		DmWhChannel dmWhChannel = dmWhChannelService.selectOne(new EntityWrapper<DmWhChannel>().eq("channel_name", channelName));
		String channelId;
		if(dmWhChannel!=null){
			channelId = dmWhChannel.getId();
		}else{
			channelId = "";
		}
		
		Integer[] countArray= statisticsService.userRegisterStatistics();
		response.getWriter().print(JSON.toJSONString(countArray));
	}*/
	
	@RequestMapping(value="getAllProjectType")
	public void getAllProjectType(HttpServletResponse response) throws IOException{

		response.getWriter().print(JSON.toJSONString(dmWhProjectcategoryService.list()));
	}
	
	
	
	@RequestMapping("getPreMonth")
	public void getPreMonth(HttpServletResponse response) throws IOException{
		  Calendar c = Calendar.getInstance();
		//过去一月
	        c.setTime(new Date());
	        c.add(Calendar.DAY_OF_MONTH, -1);
	        Date endM = c.getTime();//前一天
	        c.add(Calendar.MONTH, -1);
	        Date begintM = c.getTime();//前一个月
	        List<String> lastMonth = FindDates.findDates(begintM, endM);
	        lastMonth.remove(0);
	        //System.out.println(lastMonth+"()()("+currentM);
	        response.getWriter().print(JSON.toJSONString(lastMonth));
	        
	}
	@RequestMapping("getPreHalfMonth")
	public void getPreHalfMonth(HttpServletResponse response) throws IOException{
		  Calendar c = Calendar.getInstance();
			//过去半月
		        c.setTime(new Date());
		        c.add(Calendar.DAY_OF_MONTH, -1);
		        Date endM = c.getTime();//前一天
		        c.add(Calendar.DAY_OF_MONTH, -14);
		        Date begintM = c.getTime();//前14天
		        List<String> lastMonth = FindDates.findDates(begintM, endM);
		        //System.out.println(lastMonth+"()()("+currentM);
		        response.getWriter().print(JSON.toJSONString(lastMonth));
	}
	@RequestMapping("getPreDayTime")
	public void getPreDayTime(HttpServletResponse response) throws IOException{
		  Calendar c = Calendar.getInstance();
			//昨天
		        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd HH:mm:ss"); 
		        c.setTime(new Date());
		        Date endM = c.getTime();//此时此刻
		        c.add(Calendar.DATE, -1);//
		        c.add(Calendar.HOUR_OF_DAY, 1);
		        Date begintM = c.getTime();//昨天
		        List<String> times = FindDates.findTimes(begintM, endM);
		        //times.remove(times.size()-1);
		        times.add(sdf.format(endM));
		        //System.out.println(lastMonth+"()()("+currentM);
		        response.getWriter().print(JSON.toJSONString(times));
	}

}
