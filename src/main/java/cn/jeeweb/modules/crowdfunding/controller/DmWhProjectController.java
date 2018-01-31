package cn.jeeweb.modules.crowdfunding.controller;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.jeeweb.core.common.controller.BaseCRUDController;
import cn.jeeweb.core.security.shiro.authz.annotation.RequiresPathPermission;
import cn.jeeweb.modules.crowdfunding.entity.DmWhProject;
import cn.jeeweb.modules.crowdfunding.service.IDmWhProjectService;

/**   
 * @Title: 众筹项目
 * @Description: 众筹项目
 * @author jeeweb
 * @date 2017-10-10 11:50:17
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("${admin.url.prefix}/crowdfunding/dmwhproject")
@RequiresPathPermission("crowdfunding:dmwhproject")
public class DmWhProjectController extends BaseCRUDController<DmWhProject, Integer> {
	
	@Autowired
	private IDmWhProjectService dmWhProjectService;
	
	
	@RequestMapping("{id}/checkVerify")
	public void checkVerify(@PathVariable("id")Integer id,HttpServletResponse response) throws IOException{
		
		DmWhProject project = dmWhProjectService.get(id);
		//System.out.println("+++++++++++++"+project.getIsAudits());
		if(project.getIsAudits()!=0){
			response.getWriter().print("0");
		}else{
			response.getWriter().print("-1");
		}
		
	}
	
	
	@RequestMapping(value="{id}/shenheProject", method = {RequestMethod.GET,RequestMethod.POST})
	public String sheheProject(@PathVariable("id")String id,Model model){
		DmWhProject entity = dmWhProjectService.get(Integer.parseInt(id.trim()));
		model.addAttribute("project", entity);
		
		return display("shenhe");
		
	}
	
	@RequestMapping(value="{id}/passAudits", method = {RequestMethod.GET,RequestMethod.POST})
	public void passAudits(@PathVariable("id")String id,HttpServletResponse response) throws IOException{

		String s = "操作成功！";
		try{
			DmWhProject entity = dmWhProjectService.get(Integer.parseInt(id.trim()));
			entity.setIsAudits(1);
			dmWhProjectService.update(entity);
		}catch(Exception e){
			e.printStackTrace();
			s = "出现错误##"+e.toString();
		}
		response.getWriter().print(s);
	}
	
	@RequestMapping(value="{id}/rejectAudits", method = {RequestMethod.GET,RequestMethod.POST})
	public void rejectAudits(@PathVariable("id")String id,HttpServletResponse response) throws IOException{
		String s = "操作成功！";
		try{
			DmWhProject entity = dmWhProjectService.get(Integer.parseInt(id.trim()));
			entity.setIsAudits(-1);
			dmWhProjectService.update(entity);
		}catch(Exception e){
			e.printStackTrace();
			s = "出现错误##"+e.toString();
		}
		response.getWriter().print(s);
	}
	
	

}
