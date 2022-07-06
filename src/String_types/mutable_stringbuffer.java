package String_types;

public class mutable_stringbuffer {

	public static void main(String[] args) {
		StringBuffer r1 = new StringBuffer("raj");
		System.out.println(System.identityHashCode(r1)); // new memory create
		
		StringBuffer r2 = new StringBuffer("raj");
		System.out.println(System.identityHashCode(r2));
		
		System.out.println(System.identityHashCode(r1.append(r2))); // memory shared
		
		
		
	}
}
