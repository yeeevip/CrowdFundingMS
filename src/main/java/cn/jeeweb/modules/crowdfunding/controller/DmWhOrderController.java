package cn.jeeweb.modules.crowdfunding.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.jeeweb.core.common.controller.BaseCRUDController;
import cn.jeeweb.core.security.shiro.authz.annotation.RequiresPathPermission;
import cn.jeeweb.modules.crowdfunding.entity.DmWhOrder;

/**   
 * @Title: 订单
 * @Description: 订单
 * @author jeeweb
 * @date 2017-10-12 10:13:33
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("${admin.url.prefix}/crowdfunding/dmwhorder")
@RequiresPathPermission("crowdfunding:dmwhorder")
public class DmWhOrderController extends BaseCRUDController<DmWhOrder, Integer> {

}
