package vote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import vote.entity.Admin;
import vote.entity.ResultMsg;
import vote.service.AdminService;

@Controller
@RequestMapping("/admin/jsp")
public class IndexController {

	@Autowired
	public AdminService adminService;
	
	@RequestMapping("/index")
	@ResponseBody
	public ModelAndView index(){
		ModelAndView mv=new ModelAndView("admin/jsp/index");
		return mv;
	}
	
	@RequestMapping("/addmatch")
	@ResponseBody
	public ModelAndView addmatch(){
		ModelAndView mv=new ModelAndView("admin/jsp/addmatch");
		return mv;
	}
	
	@RequestMapping("/adminadd")
	@ResponseBody
	public ModelAndView adminadd() {
		ModelAndView mv=new ModelAndView("admin/jsp/adminadd");
		return mv;
	}
	
	//进入管理员列表 并查询所有的管理员
	@RequestMapping("/adminlist")
	@ResponseBody
	public ModelAndView adminlist() {
		List<Admin> admins=adminService.getAdmins();
		ModelAndView mv=new ModelAndView("admin/jsp/adminlist");
		mv.addObject("admins",admins);
		return mv;
	}
	//删除管理员
	@RequestMapping("/delAdmin")
	@ResponseBody
	public ResultMsg delAdmin(int id) {
		int i=adminService.delAdmin(id);
		if(i>0){
			return new ResultMsg(1,"删除成功");
		}else{
			return new ResultMsg(0,"删除失败");
		}
	}
	
	//添加管理员
	@RequestMapping("/addAdmin")
	@ResponseBody
	public ResultMsg addAdmin(String adminname,String password) {
		Admin admin=new Admin();
		admin.setAdminname(adminname);
		admin.setPassword(password);
		System.out.println(adminname);
		int i=adminService.addAdmin(admin);
		if(i>0){
			return new ResultMsg(1,"添加成功：");
		}else{
			return new ResultMsg(0,"添加失败！");
		}
	}
	
	@RequestMapping("/cate")
	@ResponseBody
	public ModelAndView cate() {
		ModelAndView mv=new ModelAndView("admin/jsp/cate");
		return mv;
	}
	
	@RequestMapping("/categories")
	@ResponseBody
	public ModelAndView categories() {
		ModelAndView mv=new ModelAndView("admin/jsp/categories");
		return mv;
	}
	
	@RequestMapping("/error")
	@ResponseBody
	public ModelAndView error() {
		ModelAndView mv=new ModelAndView("admin/jsp/error");
		return mv;
	}
	
	@RequestMapping("/memberlist")
	@ResponseBody
	public ModelAndView memberlist() {
		ModelAndView mv=new ModelAndView("admin/jsp/memberlist");
		return mv;
	}
	
	@RequestMapping("/playadd")
	@ResponseBody
	public ModelAndView playadd() {
		ModelAndView mv=new ModelAndView("admin/jsp/playadd");
		return mv;
	}
	
	@RequestMapping("/playeradd")
	@ResponseBody
	public ModelAndView playeradd() {
		ModelAndView mv=new ModelAndView("admin/jsp/playeradd");
		return mv;
	}
	
	@RequestMapping("/playerTlist")
	@ResponseBody
	public ModelAndView playerTlist() {
		ModelAndView mv=new ModelAndView("admin/jsp/playerTlist");
		return mv;
	}
}
