package org.testing;

public class Common extends Abstract1 {

	@Override
	public void saving() {
		// TODO Auto-generated method stub
		System.out.println("11%");
		
	}
    @Override
	public void fixed() {
		// TODO Auto-generated method stub
		System.out.println("13%");
		
	}
	public static void main(String[] args) {
		Common co=new Common();
		co.saving();
		co.fixed();
		co.deposit();
	}

}
