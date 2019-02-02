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
		for(int i = 0; i < temp.userLen; i++) {
			System.out.print(users[i].getUser_key()+" : ");
			System.out.print(users[i].getEmail_Address()+" : "   );
			System.out.print(users[i].getFirst_Name()+" : ");
			System.out.print(users[i].getUser_ID()+" : ");
		}
	}
	

}
