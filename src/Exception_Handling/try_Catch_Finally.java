package Exception_Handling;

public class try_Catch_Finally {

	public static void main(String[] args) {
		int a =50;
		try {
			System.out.println(a/0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("good");
		}
		System.out.println("bad");
	}
}
