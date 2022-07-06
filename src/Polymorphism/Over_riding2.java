package Polymorphism;

public class Over_riding2 extends Method_Overriding {
	
	@Override
	public void mobileName(String name) {
		super.mobileName(name);
	}
	
    @Override
    public void mobileNo(int id) {
    	super.mobileNo(id);
    }
		

	 public static void main(String[] args) {
		
		 Over_riding2 r = new Over_riding2();
		 
		 r.mobileName("redmi");
		 r.mobileNo(1234456);
	}

}
