package cn.jeeweb.modules.crowdfunding.service.impl;

import java.io.Serializable;
import java.util.List;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.core.query.data.Page;
import cn.jeeweb.core.query.data.Pageable;
import cn.jeeweb.core.query.data.Queryable;
import cn.jeeweb.modules.crowdfunding.entity.DmWhProjectcategory;
import cn.jeeweb.modules.crowdfunding.service.IDmWhProjectcategoryService;
import cn.jeeweb.modules.crowdfunding.utils.DataSource;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 项目分类
 * @Description: 项目分类
 * @author jeeweb
 * @date 2017-10-12 10:15:19
 * @version V1.0   
 *
 */
@DataSource("db_cf")
@Transactional(propagation = Propagation.SUPPORTS)
@Service("dmWhProjectcategoryService")
public class DmWhProjectcategoryServiceImpl  extends CommonServiceImpl<DmWhProjectcategory> implements  IDmWhProjectcategoryService {

	@Override
	public DmWhProjectcategory get(Serializable id) {
		// TODO Auto-generated method stub
		return super.get(id);
	}
	
	@Override
	public List<DmWhProjectcategory> list() {
		// TODO Auto-generated method stub
		return super.list();
	}
	
   @Override
	public Page<DmWhProjectcategory> list(Queryable queryable,
			DetachedCriteria detachedCriteria) {
		// TODO Auto-generated method stub
		return super.list(queryable, detachedCriteria);
	}
   @Override
	public Page<DmWhProjectcategory> list(Pageable pageable,
			DetachedCriteria detachedCriteria) {
		// TODO Auto-generated method stub
		return super.list(pageable, detachedCriteria);
	}
	
   @Override
public void batchDelete(List<DmWhProjectcategory> entitys) {
	// TODO Auto-generated method stub
	super.batchDelete(entitys);
}
   
   @Override
public void batchDeleteById(List<?> ids) {
	// TODO Auto-generated method stub
	super.batchDeleteById(ids);
}
   
   @Override
public void save(DmWhProjectcategory entity) {
	// TODO Auto-generated method stub
	super.save(entity);
}
   @Override
public void saveOrUpdate(DmWhProjectcategory entity) {
	// TODO Auto-generated method stub
	super.saveOrUpdate(entity);
}
   @Override
public void update(DmWhProjectcategory entity) {
	// TODO Auto-generated method stub
	super.myUpdate(entity);
}
	
}
