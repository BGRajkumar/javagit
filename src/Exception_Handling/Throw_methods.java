package Exception_Handling;

public class Throw_methods {
	public static void main(String[] args) throws Exception {
		
		for (int i = 1; i <= 10; i++) {
			if (i==5) {
		throw  new Exception();
				
			}
			System.out.println(i);
		}
	}

}
