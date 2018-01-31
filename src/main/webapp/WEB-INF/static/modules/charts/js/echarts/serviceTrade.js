$(function () {

	var lineChart;
	var lineoption;
	
		lineChart = echarts.init(document.getElementById("echarts-serviceTrade-chart"));
//		lineChart.showLoading({
//			text: "图表数据正在努力加载..."
//			});
		
		lineoption = {
			        title : {
			            text: '项目交易量统计'
			        },
			        tooltip : {
			            trigger: 'axis'
			        },
			        grid:{
			            x:45,
			            x2:40,
			            y2:24
			        },
			        calculable : true,
			        xAxis : [
			            {
			                type : 'category',
			                boundaryGap : false,
			                data : []
			            }
			        ],
			        yAxis : [
			            {
			                type : 'value',
			                axisLabel : {
			                    formatter: '{value}'
			                }
			            }
			        ],
			        series : [
			                  {
			                	  name:'交易量',
			                      type:'line',
			                      data:[]}
			                  ]
			    };
			    
	lineChart.setOption(lineoption,true);
	


	
	
    $(window).resize(lineChart.resize);
    
   
    
    
    var myDate = new Date();
	var service = $("#serviceSelect select[name='serviceComment']");
	var channel = $("#serviceSelect select[name='channelComment']");
	var sType = $("#serviceSelect select[name='sType']");
	
	 loadData(service.val(),sType.val());
	 
	$.get(adminPath+"/crowdfunding/statistics/getAllProjectType", function(
			data, status) {
		//alert(status);
		data = eval('(' + data + ')');
		for ( var i in data) {
			service.append('<option value="'+data[i].id+'">'
					+ data[i].categoryName + '</option>');
		}
		 
	});
	
	service.change(function(){

		lineoption.series[0].data.splice(0,lineoption.series[0].data.length);//清空数组
/*		for(var i=0;i<8;i++){
			lineoption.series[0].data.push(Math.round(Math.random()*1000+1));
		}*/
		loadData(service.val(),sType.val());
		
		});
	
	sType.change(function(){

		lineoption.series[0].data.splice(0,lineoption.series[0].data.length);//清空数组

		loadData(service.val(),sType.val());
		
		});
   
	function loadData(serviceName,sType){
			$.get(adminPath+"/crowdfunding/statistics/projectTransactionStatistics/"+serviceName+"/"+sType, function(data) {
		//alert(status);
		data = eval('(' + data + ')');
		//alert(data[09]);
		//lineoption.series[0].data.splice(0,lineoption.series[0].data.length);//清空数组
		if(sType=="hour"){
			
			lineoption.xAxis[0].data.splice(0,lineoption.xAxis[0].data.length);//清空数组
			
			$.get(adminPath+"/crowdfunding/statistics/getPreDayTime", function(tdata){
				tdata = eval('(' + tdata + ')');
				for(var i=0;i<tdata.length;i++){
					if(i<tdata.length-1){
						lineoption.xAxis[0].data.push(tdata[i].split(":")[0]+"时");
					}else{
						lineoption.xAxis[0].data.push(tdata[i]);
					}
					
					if(tdata[i].split(" ")[1].split(":")[1]!="00"){
						lineoption.series[0].data.push(data[(tdata[i].split(" ")[1].split(":")[0])-0]);
						continue;
					}
					if(tdata[i].split(" ")[1].split(":")[0]=="00"){
						lineoption.series[0].data.push(data[23]);
						continue;
					}
					lineoption.series[0].data.push(data[tdata[i].split(" ")[1].split(":")[0]-1]);
				}
				lineChart.setOption(lineoption,true);
			});
			
			
			return;
		}
		if(sType=="day"){
			
			lineoption.xAxis[0].data.splice(0,lineoption.xAxis[0].data.length);//清空数组
			//var monthDay = getDaysInMonth(myDate.getYear(),myDate.getMonth());
			$.get(adminPath+"/crowdfunding/statistics/getPreMonth", function(sdata){
				sdata = eval('(' + sdata + ')');
				
				for(var i=0;i<sdata.length;i++){
					//alert(sdata[i].split("-")[2]);
					lineoption.xAxis[0].data.push(sdata[i]);				
					lineoption.series[0].data.push(data[sdata[i].split("-")[2]-1]);
				}
				lineChart.setOption(lineoption,true);
			});
			
			
			return;
		}
		

	});

	}
	
	function getDaysInMonth(year,month){ 
		month = parseInt(month,10); //parseInt(number,type)这个函数后面如果不跟第2个参数来表示进制的话，默认是10进制。 
		var temp = new Date(year,month,0); 
		return temp.getDate(); 
		}

  
    
});
