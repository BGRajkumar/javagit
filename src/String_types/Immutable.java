package String_types;

public class Immutable {
	
	public static void main(String[] args) {
		
		String r1 = "raj";
		System.out.println(System.identityHashCode(r1));
		
		String r2 = "raj";
		System.out.println(System.identityHashCode(r2));
		
		System.out.println(System.identityHashCode(r1+r2));
		
		
		
	}

}
