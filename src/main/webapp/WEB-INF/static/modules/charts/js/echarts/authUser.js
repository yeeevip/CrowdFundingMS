$(function () {
    var barChart = echarts.init(document.getElementById("echarts-authUser-chart"));
    var baroption = {
        title : {
            text: '用户注册统计'
        },
        tooltip : {
            trigger: 'axis'
        },
        grid:{
            x:30,
            x2:40,
            y2:24
        },
        calculable : true,
        xAxis : [
            {
                type : 'category',
                
                data : []
            }
        ],
        yAxis : [
            {
                type : 'value'
            }
        ],
        series : [
            {
                name:'用户数',
                type:'bar',
                /*barWidth : 30,*/
                data:[],
            }
        ]
    };
    $.get(adminPath+"/crowdfunding/statistics/getPreHalfMonth", function(sdata){
		sdata = eval('(' + sdata + ')');
		//alert(sdata);
		$.get(adminPath+"/crowdfunding/statistics/userRegisterStatistics", function(stadata){
			stadata = eval('(' + stadata + ')');
			for(var i=0;i<sdata.length;i++){
				//alert(sdata[i].split("-")[2]-1);
				baroption.xAxis[0].data.push(sdata[i]);	
				baroption.series[0].data.push(stadata[sdata[i].split("-")[2]-1]);
			}
			console.log(baroption.series[0].data);
			barChart.setOption(baroption,true);
		});
		
		
	});

    $(window).resize(barChart.resize);
    

});
