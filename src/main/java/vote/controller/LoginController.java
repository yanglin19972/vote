package vote.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import vote.entity.Admin;
import vote.entity.ResultMsg;
import vote.service.AdminService;

@Controller

public class LoginController {

	@Autowired
	public AdminService adminService;
	
	@RequestMapping("/login")
	@ResponseBody
	public ModelAndView login(){
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	
	@RequestMapping("/login_submit")
	@ResponseBody
	public ResultMsg login_submit(String adminname,String password,Model model) {
		Admin admin=new Admin();
		admin.setAdminname(adminname);
		admin.setPassword(password);
		Admin admin1=adminService.AdminLogin(admin);
		System.out.println(admin.getAdminname());
		System.out.println(admin.getPassword());
		if(admin1!=null){
			return new ResultMsg(1,adminname);
		}else{
			return new ResultMsg(0,adminname);
		}
	}
	
	
}
