package studio3;

import java.util.ArrayList;

public class User {

	protected String username;
	protected String password;
	protected static ArrayList<User> users = new ArrayList<User>();
	public static String derp = "derp";
	protected String inputPW = "derp";
	protected String hashedPass;
	protected static int userCount = 0;
	
	public User(String username, String password){
		
		if (isValidUsername(username)){
			this.username = username;
		}
		else
			throw new IllegalArgumentException();
		hashedPass = password.hashPassword();
		this.password = hashedPass;
		
		
		users.add(this);
		userCount++;
	}
	
	public String getUsername(){
		return this.username;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public static int getUserCount(){
		return userCount;
	}
	
	public static ArrayList<User> getAllUsers(){
		return users;
	}

//	4-12 characters long, starts with a letter, and contains only letters, numbers, -, and _ 
//	This check should happen in the constructor, and an appropriate exception 
//	should be thrown if the password is not valid. For this task, use the Pattern class, 
//	following the pattern used near the top of the linked reference page. 
//	The regular expression to use is: [a-zA-Z][a-zA-Z0-9_-]{4,11}.
//	finish me	
	public static boolean isValidUsername(String username){
		if (username.length() >= 4 && username.length() <= 12){
			if (Character.isLetter(username.charAt(0))){
				if  (username.contains("[a-zA-Z0-9_-]+")){
					return true;
				}
				else
					return false;
			}
			else
				return false;
		}
		else 
			return false;
	}
	
	//finish ME!
	public boolean isValidPassword(){
		if (hashedPass == password.hashPassword())
			return true;
		else
			return false;
	}
	
	//finish ME!
	protected static String hashPassword(String password){
		return derp;
	}
	
	public static void main(String[] args) {

	}

}
