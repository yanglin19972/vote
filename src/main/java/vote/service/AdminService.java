package vote.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vote.dao.AdminDao;
import vote.entity.Admin;

@Service
public class AdminService {
	@Autowired
	private AdminDao adminDao;
	public Admin AdminLogin(Admin admin) {
		return adminDao.AdminLogin(admin);
	
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
