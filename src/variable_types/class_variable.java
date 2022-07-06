package variable_types;

public class class_variable {
	
       int a = 90;
       private void vijay() {
         int a = 66;
         System.out.println(a);
	}
       private void ajith() {
         int a = 64;
         System.out.println(a);
         
	}
       public static void main(String[] args) {
		
    	   class_variable r = new class_variable();
    	   r.vijay();
    	   r.ajith(); // method level
    	   System.out.println(r.a); //variable level
	}
}

