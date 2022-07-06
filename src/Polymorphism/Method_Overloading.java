package Polymorphism;

public class Method_Overloading {
	
	public void mobile_details(int a) {
		System.out.println(a);
		
	}
	
    public void mobile_details(String name, String model, int ram ) {
    	
    	System.out.println(name+" "+model+" "+ram);
    
}
    
    public void mobile_details(int storage, int screen) {
		System.out.println(storage+" "+screen);

	}
    
    public static void main(String[] args) {
		Method_Overloading r = new Method_Overloading();
		
		r.mobile_details(1);
		String samsung;
		r.mobile_details("samsung","galaxy" ,8);
		r.mobile_details(64, 6);
		
	}
}
  