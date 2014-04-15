package com.lyovkin.app;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.lyovkin.dao.UserDao;
import com.lyovkin.model.User;

public class App {
	
	public static void main(String[] args){
		UserDao dao = new UserDao();
		
		//add
		User user = new User();
		user.setFirstName("Anatoliy");
		user.setLastName("Lyovkin");
		try{
			Date dob =new SimpleDateFormat("yyyy-MM-dd").parse("1987-03-09");
			user.setDob(dob);
		} catch (ParseException e){
			e.printStackTrace();
		}
		
		user.setEmail("anatoliymolinari@gmail.com");
		dao.addUser(user);
		
		
		
		//update
		
		user.setEmail("anatoliymolinaro@gmail.com");
		user.setUserid(1);
		dao.updateUser(user);
		
		//delete
		
		//dao.deleteUser(2);
		
		//get all
		for(User iter:dao.getAllUsers()){
			System.out.println(iter);
		}
		
		//get by id
		
		System.out.println(dao.getUserById(8));
		
		/*try{
			DbUtil.getConnection().close();
		} catch (SQLException e){
			e.printStackTrace();
		}*/
	}
	

}
