package String;

public class String_function {

	public static void main(String[] args) {
		
		String r  = "Welcome to india";
		String r1 = "welcome to india";
		String r2 = " ";
		String r3 = null;
		String r4 = "";
		String r5 = "  hello trichy  "; 
		int length = r.length();    // CTRL + 2+ L
		System.out.println(length);
		boolean equals = r1.equals(r);
		System.out.println(equals);
		boolean equalsIgnoreCase = r.equalsIgnoreCase(r1);
		System.out.println(equalsIgnoreCase);
		String upperCase = r.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = r.toLowerCase();
		System.out.println(lowerCase);
		boolean startsWith = r.startsWith(r1);
		System.out.println(startsWith);
	    boolean endsWith = r1.endsWith(r);
	    System.out.println(endsWith);
	    boolean contains = r5.contains("i");
	    System.out.println(contains);
	    int indexOf = r.indexOf("i");
        System.out.println(indexOf);
        int lastIndexOf = r.lastIndexOf("a");
        System.out.println(lastIndexOf);
        char charAt = r1.charAt(2);
        System.out.println(charAt);
        String replace = r2.replace(" ","trichy");
        System.out.println(replace);
        String substring = r1.substring(14);
        System.out.println(substring);
        boolean empty = r4.isEmpty();
        System.out.println(empty);
        String trim = r5.trim();
        System.out.println(trim);
        String[] split = r.split(" ");
        for (String w : split) {
        	System.out.println(w);    
			
		}
           
		}
}

