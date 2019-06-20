package vote.dao;


import java.util.List;

import vote.entity.Admin;

public interface AdminDao {
	Admin AdminLogin(Admin admin);
	List<Admin> getAdmins();
	int delAdmin(int id);
	int addAdmin(Admin admin);
}
