package org.lessons.java.security;

public class PasswordGenerator {
	
	public static void main(String[] args) {

	String name = "Pinco";
	
	String surname = "Pallo";
	
	String birth = "12-05-1994";
	
	String color = "magenta";
	
	int sum = 12 + 5 + 1994;
	
	System.out.println(sum);
	
	String password= name + surname + color + sum;
	
	System.out.println(password);
	
	
	
	}
}
