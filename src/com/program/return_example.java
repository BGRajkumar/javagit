package com.program;

public class return_example {
 static	 int a;//0
	public static int demo() {
   a = 50;
   // System.out.println(a);
   return a;
 //  a = 70; we cannot change  the variable value after return to the method
   
	}
	public static void main(String[] args) {
		demo();
	}
		
	}

