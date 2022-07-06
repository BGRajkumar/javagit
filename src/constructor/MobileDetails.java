
package constructor;

public class MobileDetails {

	public MobileDetails() {
		System.out.println("mobile");
	}
	
	public MobileDetails(String name) {
		System.out.println(name);
	}
	
	public MobileDetails(int ram) {
		System.out.println(ram);
	}
	
	public MobileDetails(float screensize) {
		System.out.println(screensize);
	}
	public static void main(String[] args) {
		
		MobileDetails r = new MobileDetails();
		MobileDetails r1 = new MobileDetails("redmi");
		MobileDetails r2 = new MobileDetails( 6);
		MobileDetails r3 = new MobileDetails(6.5f);
		
		
		
	}
}

