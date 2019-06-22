package vote.controller;




import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import vote.entity.Play;
import vote.entity.Player;
import vote.entity.show;
import vote.entity.ResultMsg;
import vote.service.AdminService;

@Controller

public class AdminController {
	@Autowired
	private AdminService Adminservice; 
	
	@RequestMapping("/addplayer")
	@ResponseBody
	public ModelAndView addplayer() {
		ModelAndView mv=new ModelAndView("playeradd");
		List<Play> plays= Adminservice.findplay();
		Collections.reverse(plays);
		mv.addObject("plays", plays);
		return mv;
	}
	
   @RequestMapping("/show")
   @ResponseBody
   public ModelAndView show() {
	   ModelAndView mv=new ModelAndView("categories");
	   List<show> shows=Adminservice.findpk();
	   Collections.reverse(shows);
	   mv.addObject("shows", shows);	  
	   return mv;	   
   }
   @RequestMapping("/addsubmit")
   @ResponseBody
	public ResultMsg add_submit(String username,String phone,String sex,String play,String repass ){
		//新增选手
	   Player player=new Player();
	   player.setPlayername(username);
	   player.setSex(sex);
	   player.setTel(phone); 
	   Play play1=new Play();
	   play1.setPlayname(play);
	   return new ResultMsg(0,"新增失败");
		
	}
	
}
