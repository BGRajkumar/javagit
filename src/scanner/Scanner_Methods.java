package scanner;

import java.util.Scanner;

public class Scanner_Methods {
	
	public static void main(String[] args) {
		
		Scanner r = new Scanner(System.in);
		
		
	
    	System.out.println("enter your name");
		String name = r.next();
    	System.out.println(name);
		
		r.nextLine();
		System.out.println("enter your mobilename:");
		String mobilename = r.nextLine();
		System.out.println(mobilename);
		
		System.out.println("enter your mobileno");
		int mobileno = r.nextInt();
		System.out.println(mobileno);
		
		
		System.out.println("enter your screen size:");
		float screensize = r.nextFloat();
		System.out.println(screensize);
		
		System.out.println("enter your marks");
		double marks = r.nextDouble();
		System.out.println(marks);
		
		
	}
	
	

}
