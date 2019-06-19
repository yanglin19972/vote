package vote.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vote.dao.AdminDao;

@Service
public class AdminService {
	@Autowired
	private AdminDao adminDao;
	public int AdminLogin(String admin_name,String admin_pass) {
		int i=adminDao.AdminLogin(admin_name, admin_pass);
		return i;
	}
}
