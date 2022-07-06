package Abstraction_methods;

public class Coach extends Cricket {

	@Override
	public void tshirtNo() {
		System.out.println("07");
		 
		
	}
	
	public static void main(String[] args) {
		
		Coach r = new Coach();
		r.playerRun();
		r.playerName();
		r.tshirtNo();
	}

}
