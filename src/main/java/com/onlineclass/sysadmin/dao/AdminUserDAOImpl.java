package com.onlineclass.sysadmin.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.onlineclass.sysadmin.entity.AdminUser;
import com.onlineclass.sysadmin.entity.AdminUser_CommonCode;
import com.onlineclass.sysadmin.util.MyBatisUtil;

@Repository
public class AdminUserDAOImpl implements AdminUserDAO {

	@Override
	public List<AdminUser> getAllUser() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<AdminUser> employeesList = session.selectList("getAllUsers");
		session.commit();
		session.close();
		return employeesList;
	}
	
	@Override
	public List<AdminUser_CommonCode> getAllUser_CommonCode() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<AdminUser_CommonCode> employeesList = session.selectList("getAllUsersWithComminCode");
		session.commit();
		session.close();
		return employeesList;
	}

	@Override
	public AdminUser getUserByID(Integer ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addNewUser(AdminUser adminUser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(AdminUser adminUser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(Integer ID) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.delete("deleteUser", ID);
		session.commit();
		session.close();
		
	}

	@Override
	public int getTotalUser() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Integer totalUser = session.selectOne("getTotalUser");
		session.commit();
		session.close();
		return totalUser;
	}

	@Override
	public List<AdminUser_CommonCode> getAllUserInRage(Map<String, Object> params) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<AdminUser_CommonCode> employeesList = session.selectList("getAllUsersInRange",params);
		session.commit();
		session.close();
		return employeesList;
	}

}