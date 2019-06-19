package vote.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import vote.entity.Game;
import vote.entity.ResultMsg;
import vote.service.AdminService;

@Controller
public class AdminController {
	@Autowired
	private AdminService Adminservice; 
	
	@RequestMapping("game")
	@ResponseBody//��ӱ���ͶƱ
	public ResultMsg Addgame(Game game) {
		int i =Adminservice.Addgame(game);
		if(i>0) {
			return new ResultMsg(1,"��ӱ����ɹ�");
		}else {
			return new ResultMsg(0,"��ӱ���ʧ��");
		}
	}
}
