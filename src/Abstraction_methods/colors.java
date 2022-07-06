package Abstraction_methods;

public class colors implements fruits {

	@Override
	public void apple() {
		System.out.println("red");
		
	}

	@Override
	public void banana() {
		System.out.println("yellow");
		
	}

	@Override
	public void graps() {
		System.out.println("black");
		
	}
	public static void main(String[] args) {
		colors r = new colors();
		
		r.apple();
		r.banana();
		r.graps();
	}

 
}
