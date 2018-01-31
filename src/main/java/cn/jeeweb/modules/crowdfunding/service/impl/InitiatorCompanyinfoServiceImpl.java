package cn.jeeweb.modules.crowdfunding.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.crowdfunding.entity.InitiatorCompanyinfo;
import cn.jeeweb.modules.crowdfunding.service.IInitiatorCompanyinfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 企业身份信息
 * @Description: 企业身份信息
 * @author quhailong
 * @date 2017-11-06 16:37:49
 * @version V1.0   
 *
 */
@Transactional
@Service("initiatorCompanyinfoService")
public class InitiatorCompanyinfoServiceImpl  extends CommonServiceImpl<InitiatorCompanyinfo> implements  IInitiatorCompanyinfoService {

}
