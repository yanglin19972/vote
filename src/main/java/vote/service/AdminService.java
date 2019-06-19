package vote.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vote.dao.AdminDao;
import vote.dao.GameDao;
import vote.entity.Game;

@Service
public class AdminService {
	@Autowired
	private AdminDao adminDao;
	@Autowired
	private GameDao gameDao;
	public int AdminLogin(String admin_name,String admin_pass) {
		int i=adminDao.AdminLogin(admin_name, admin_pass);
		return i;
	}
	public int Addgame(Game game) {
		int i=gameDao.insertgame(game);
	    return i;
	}
	public int delgame(String gamename) {
		int i =gameDao.delgame(gamename);
		return i;
	}
	public int update(Game game) {
		int i =gameDao.updategame(game);
		return i;
	}
}
