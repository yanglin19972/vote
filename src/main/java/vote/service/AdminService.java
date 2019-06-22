package vote.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vote.dao.AdminDao;
import vote.dao.PlayerDao;
import vote.entity.Admin;
import vote.entity.Play;
import vote.entity.Player;
import vote.entity.show;

@Service
public class AdminService {
	@Autowired
	private AdminDao adminDao;
	@Autowired
	private PlayerDao gameDao;
	public Admin AdminLogin(Admin admin) {
		return adminDao.AdminLogin(admin);
	
	}
	public int update(Play game) {
		int i =gameDao.updategame(game);
		return i;
	}
	public List<Player> findplayer() {
		return gameDao.findplayer();
	}
	public List<Play> findplay(){
		return gameDao.findplay();
	}
	public List<show> findpk(){
		return gameDao.findpk();
	}
	public List<Admin> getAdmins() {
		return adminDao.getAdmins();
	}
	
	public int delAdmin(int id) {
		return adminDao.delAdmin(id);
	}
	
	public int addAdmin(Admin admin) {
		return adminDao.addAdmin(admin);
	}
}
