package vote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import vote.entity.ResultMsg;
import vote.service.AdminService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	public AdminService adminService;
	
	@RequestMapping("/login")
	@ResponseBody
	public ResultMsg login(String admin_name,String admin_pass) {
		int i=adminService.AdminLogin(admin_name, admin_pass);
		if(i>0){
			return new ResultMsg(1,"登陆成功");
		}else {
			return new ResultMsg(0,"登陆失败");
		}
	}
}
