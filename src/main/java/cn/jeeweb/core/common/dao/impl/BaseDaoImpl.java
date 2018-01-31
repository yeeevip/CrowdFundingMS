package cn.jeeweb.core.common.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import cn.jeeweb.core.common.dao.IBaseDao;

public class BaseDaoImpl implements IBaseDao {

	protected final Logger logger = LoggerFactory.getLogger(BaseDaoImpl.class);
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;



	@Override
	public final Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}

}