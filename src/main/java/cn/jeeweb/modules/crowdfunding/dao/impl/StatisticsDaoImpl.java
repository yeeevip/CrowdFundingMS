package cn.jeeweb.modules.crowdfunding.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.jdbc.Work;







import com.mysql.jdbc.CallableStatement;

import cn.jeeweb.core.common.dao.impl.BaseDaoImpl;
import cn.jeeweb.modules.crowdfunding.dao.StatisticsDao;
import cn.jeeweb.modules.crowdfunding.entity.Statistics;

public class StatisticsDaoImpl extends BaseDaoImpl implements StatisticsDao {

	@Override
	public List<Statistics> projectTransactionStatistics(final String projectType,
			final String sType) {
		// TODO Auto-generated method stub
		Session session = getSession();
		
		StringBuffer sb = new StringBuffer();
		
		
		final List<Statistics> statisticsList= null;
		session.doWork(new Work() {
			
			@SuppressWarnings("null")
			@Override
			public void execute(Connection connection) throws SQLException {
				// TODO Auto-generated method stub
				
				String proStr = "{call noParam("+projectType+","+sType+")}";  
			    CallableStatement callableStatement = (CallableStatement) connection.prepareCall(proStr);
				
				//PreparedStatement ps = connection.prepareStatement("");
				ResultSet rs = callableStatement.executeQuery();
				while(rs.next()){
					Statistics s = new Statistics();
					s.setsDate(rs.getString("sdate"));
					s.setCount(rs.getInt("count"));
					statisticsList.add(s);
				}
				
				
			}
		});
		return statisticsList;
	}

	@Override
	public List<Statistics> userRegisterStatistics() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Statistics> projectLaunchStatistics(String projectType) {
		// TODO Auto-generated method stub
		return null;
	}


}
