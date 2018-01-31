$(function () {
    var barChart = echarts.init(document.getElementById("echarts-userLoan-chart"));
    var baroption = {
        title : {
            text: '项目发起统计'
        },
        tooltip : {
            trigger: 'axis'
        },
        grid:{
            x:41,
            x2:20,
            y2:24
        },
        calculable : true,
        yAxis : [
            {
                type : 'category',
                data : []
            }
        ],
        xAxis : [
            {
            	
                type : 'value'
            }
        ],
        series :[]
    };
    
    $.get(adminPath+"/crowdfunding/statistics/getPreHalfMonth", function(sdata){
		sdata = eval('(' + sdata + ')');
		for(var i=0;i<sdata.length;i++){
			baroption.yAxis[0].data.push(sdata[i].split("-")[1]+"/"+sdata[i].split("-")[2]);
		}
		$.get(adminPath+"/crowdfunding/statistics/getAllProjectType",function(data){
    		data = eval('(' + data + ')');
    		for(var j in data){
    			
    				baroption.series.push({
     				   name:data[j].categoryName,
                        type:'bar',
                       stack: '总量',
                       itemStyle : { normal: {label : {show: true, position: 'inside'}}},
                       data:[]
                       });
    				$.ajax({
    					url:adminPath+"/crowdfunding/statistics/projectCountByTypeStatistics/"+data[j].id,
    					type:"get",
    					async:false,//同步
    					success:function(stadata){
    						stadata = eval('(' + stadata + ')');
            					for(var i=0;i<sdata.length;i++){
                					baroption.series[j].data.push(stadata[sdata[i].split("-")[2]-1]);
                    			}
    				}});	
    				
            	}
    		barChart.setOption(baroption,true);
    	});
		
		
					
    
	});
    
    
    

    window.onresize = barChart.resize;

    

});
