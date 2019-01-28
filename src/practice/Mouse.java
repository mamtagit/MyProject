package practice;

public class Mouse extends Laptop {

	@Override
	public void office() {
		// TODO Auto-generated method stub
		System.out.println("ibm");

	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("2 hour");

	}

	public static void main(String[] args) {
		Mouse mo = new Mouse();
		mo.office();
		mo.work();
		mo.pending();
	}

}
