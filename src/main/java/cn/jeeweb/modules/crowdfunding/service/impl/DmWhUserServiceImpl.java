package cn.jeeweb.modules.crowdfunding.service.impl;


import java.io.Serializable;
import java.util.List;

import cn.jeeweb.core.common.dao.ICommonDao;
import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.core.query.data.Page;
import cn.jeeweb.core.query.data.Queryable;
import cn.jeeweb.core.utils.SpringContextHolder;
import cn.jeeweb.modules.crowdfunding.entity.DmWhUser;
import cn.jeeweb.modules.crowdfunding.service.IDmWhUserService;
import cn.jeeweb.modules.crowdfunding.utils.DataSource;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.metamodel.domain.Superclass;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 众筹 用户
 * @Description: 众筹 用户
 * @author quhailong
 * @date 2017-10-10 11:20:01
 * @version V1.0   
 *
 */

@Transactional(propagation = Propagation.SUPPORTS)
@Service("dmWhuserService")
@DataSource("db_cf")
public class DmWhUserServiceImpl  extends CommonServiceImpl<DmWhUser> implements  IDmWhUserService {

	
	
	@Override
	public Page<DmWhUser> list(Queryable queryable,
			DetachedCriteria detachedCriteria) {
		return super.list(queryable, detachedCriteria);
	}
	
	@Override
	public int count(Criterion... criterions) {
		// TODO Auto-generated method stub
		return super.count(criterions);
	}
	
	

	
	@Override
	public DmWhUser get(Serializable id) {
		// TODO Auto-generated method stub
		return super.get(id);
	}
	

	@Override
	public void update(DmWhUser entity) {
		// TODO Auto-generated method stub

		super.myUpdate(entity);
	}
	
	@Override
	public void delete(DmWhUser entity) {
		// TODO Auto-generated method stub
		super.delete(entity);
	}
	
	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}
	
	@Override
	public void batchDeleteById(List<?> ids) {
		// TODO Auto-generated method stub
		super.batchDeleteById(ids);
	}
	
	@Override
	public void batchDelete(List<DmWhUser> entitys) {
		// TODO Auto-generated method stub
		super.batchDelete(entitys);
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return super.count();
	}
	
	

	@Override
	public List<DmWhUser> list() {
		// TODO Auto-generated method stub
		return super.list();
	}
	
	@Override
	public void save(DmWhUser entity) {
		// TODO Auto-generated method stub
		
		super.save(entity);
	}
	@Override
	public void saveOrUpdate(DmWhUser entity) {
		// TODO Auto-generated method stub
		super.saveOrUpdate(entity);
	}
	
	
	
	
}
