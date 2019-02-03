package com.user;

public class Display_Screen {

	public User Tarun(User u)
	{
		return u; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Db_Connection temp = new Db_Connection();
		User[] users = temp.conman();
		System.out.println("USER DATA");
		for(int i = 0; i < temp.userLen; i++) {
			System.out.println("-----------------------");
			System.out.println(users[i].getUser_key());
			System.out.println(users[i].getUser_ID());
			System.out.println(users[i].getFirst_Name());
			System.out.println(users[i].getLast_name());
			System.out.println(users[i].getFull_name());
			System.out.println(users[i].getEmail_Address());
			System.out.println("-----------------------");
		}
	}
	
}
