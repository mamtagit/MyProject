package practice;

public class Common implements Inter {

	@Override
	public void fixed() {
		// TODO Auto-generated method stub
		System.out.println("10");

	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("1");

	}

	@Override
	public void saving() {
		// TODO Auto-generated method stub
		System.out.println("2");

	}

	public static void main(String[] args) {
		Common co = new Common();
		co.saving();
		co.fixed();
		co.deposit();
	}

}
