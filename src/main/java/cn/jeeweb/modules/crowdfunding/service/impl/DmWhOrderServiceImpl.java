package cn.jeeweb.modules.crowdfunding.service.impl;

import java.io.Serializable;
import java.util.List;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.core.query.data.Page;
import cn.jeeweb.core.query.data.Queryable;
import cn.jeeweb.modules.crowdfunding.entity.DmWhOrder;
import cn.jeeweb.modules.crowdfunding.service.IDmWhOrderService;
import cn.jeeweb.modules.crowdfunding.utils.DataSource;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 订单
 * @Description: 订单
 * @author jeeweb
 * @date 2017-10-12 10:13:33
 * @version V1.0   
 *
 */
@DataSource("db_cf")
@Transactional(propagation = Propagation.SUPPORTS)
@Service("dmWhOrderService")
public class DmWhOrderServiceImpl  extends CommonServiceImpl<DmWhOrder> implements  IDmWhOrderService {
	
	@Override
	public DmWhOrder get(Serializable id) {
		// TODO Auto-generated method stub
		return super.get(id);
	}
	
	@Override
	public List<DmWhOrder> list() {
		// TODO Auto-generated method stub
		return super.list();
	}
	
	@Override
	public Page<DmWhOrder> list(Queryable queryable,
			DetachedCriteria detachedCriteria) {
		// TODO Auto-generated method stub
		return super.list(queryable, detachedCriteria);
	}
	
	@Override
	public void batchDeleteById(List<?> ids) {
		// TODO Auto-generated method stub
		super.batchDeleteById(ids);
	}
	@Override
	public void batchDelete(List<DmWhOrder> entitys) {
		// TODO Auto-generated method stub
		super.batchDelete(entitys);
	}
	
	@Override
	public void update(DmWhOrder entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}
	@Override
	public void saveOrUpdate(DmWhOrder entity) {
		// TODO Auto-generated method stub
		super.saveOrUpdate(entity);
	}
	
	@Override
	public void save(DmWhOrder entity) {
		// TODO Auto-generated method stub
		super.myUpdate(entity);
	}
	

}
