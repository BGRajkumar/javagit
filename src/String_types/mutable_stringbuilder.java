package String_types;

public class mutable_stringbuilder {
	public static void main(String[] args) {
		
		StringBuilder r1 = new StringBuilder("raj");
		System.out.println(System.identityHashCode(r1)); 
		
		StringBuilder r2 = new StringBuilder("raj");
		System.out.println(System.identityHashCode(r2));
		
		System.out.println(System.identityHashCode(r1.append(r2))); 
	}

}
