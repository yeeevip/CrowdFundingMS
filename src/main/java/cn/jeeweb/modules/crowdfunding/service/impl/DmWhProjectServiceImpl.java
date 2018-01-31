package cn.jeeweb.modules.crowdfunding.service.impl;

import java.io.Serializable;
import java.util.List;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.core.database.dynamic.dao.DynamicDBDao;
import cn.jeeweb.core.query.data.Condition.Operator;
import cn.jeeweb.core.query.data.Page;
import cn.jeeweb.core.query.data.Queryable;
import cn.jeeweb.modules.crowdfunding.entity.DmWhProject;
import cn.jeeweb.modules.crowdfunding.service.IDmWhProjectService;
import cn.jeeweb.modules.crowdfunding.utils.DataSource;
import cn.jeeweb.modules.sys.utils.DynamicDBUtils;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 众筹项目
 * @Description: 众筹项目
 * @author jeeweb
 * @date 2017-10-10 11:50:17
 * @version V1.0   
 *
 */
@DataSource("db_cf")
@Transactional(propagation = Propagation.SUPPORTS)
@Service("dmWhProjectService")
public class DmWhProjectServiceImpl  extends CommonServiceImpl<DmWhProject> implements  IDmWhProjectService {
	
	
	
	
	@Override
	public Page<DmWhProject> list(Queryable queryable,
			DetachedCriteria detachedCriteria) {
		// TODO Auto-generated method stub

		return super.list(queryable, detachedCriteria);
	}
	
	@Override
	public void save(DmWhProject entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}
	@Override
	public void saveOrUpdate(DmWhProject entity) {
		// TODO Auto-generated method stub
		super.saveOrUpdate(entity);
	}
	
	@Override
	public DmWhProject get(Serializable id) {
		// TODO Auto-generated method stub
		return super.get(id);
	}
	
	@Override
	public void delete(DmWhProject entity) {
		// TODO Auto-generated method stub
		super.delete(entity);
	}
	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}
	@Override
	public void update(DmWhProject entity) {
		// TODO Auto-generated method stub
		super.myUpdate(entity);
	}

}
