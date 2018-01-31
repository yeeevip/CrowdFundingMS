package cn.jeeweb.modules.crowdfunding.controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;

import cn.jeeweb.core.common.controller.BaseCRUDController;
import cn.jeeweb.core.security.shiro.authz.annotation.RequiresPathPermission;
import cn.jeeweb.modules.crowdfunding.entity.DmWhProjectcategory;
import cn.jeeweb.modules.crowdfunding.service.IDmWhProjectcategoryService;

/**   
 * @Title: 项目分类
 * @Description: 项目分类
 * @author jeeweb
 * @date 2017-10-12 10:15:19
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("${admin.url.prefix}/crowdfunding/dmwhprojectcategory")
@RequiresPathPermission("crowdfunding:dmwhprojectcategory")
public class DmWhProjectcategoryController extends BaseCRUDController<DmWhProjectcategory, Integer> {
	
	@Autowired
	private IDmWhProjectcategoryService dmWhProjectcategoryService;
	
	
	@RequestMapping("getAllCategory")
	public void getAllCategory(HttpServletResponse resp) throws IOException{
		List<DmWhProjectcategory> list = dmWhProjectcategoryService.list();
		resp.getWriter().print(JSON.toJSONString(list));
	}

}
