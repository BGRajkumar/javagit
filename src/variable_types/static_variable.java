package variable_types;

public class static_variable {
	
	static int a = 70;
	
	private static void raj() {
     int a = 60;
     System.out.println(a);
	}

	private static void kumar() {
    System.out.println(a);
    
	}
	
	public static void main(String[] args) {
		
		raj();
		kumar();
		System.out.println(a);
	}
}
