package cn.jeeweb.modules.crowdfunding.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.crowdfunding.entity.InitiatorPersoninfo;
import cn.jeeweb.modules.crowdfunding.service.IInitiatorPersoninfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 个人身份信息
 * @Description: 个人身份信息
 * @author quhailong
 * @date 2017-11-06 16:40:53
 * @version V1.0   
 *
 */
@Transactional
@Service("initiatorPersoninfoService")
public class InitiatorPersoninfoServiceImpl  extends CommonServiceImpl<InitiatorPersoninfo> implements  IInitiatorPersoninfoService {

}
