package cn.jeeweb.modules.crowdfunding.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.jeeweb.core.common.controller.BaseCRUDController;
import cn.jeeweb.core.security.shiro.authz.annotation.RequiresPathPermission;
import cn.jeeweb.modules.crowdfunding.entity.DmWhUser;

/**   
 * @Title: 众筹 用户
 * @Description: 众筹 用户
 * @author quhailong
 * @date 2017-10-10 11:20:01
 * @version V1.0   
 *
 */

@Controller
@RequestMapping("${admin.url.prefix}/crowdfunding/user")
@RequiresPathPermission("crowdfunding:user")
public class DmWhUserController extends BaseCRUDController<DmWhUser, Integer> {

}
