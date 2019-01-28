package MultipleInheritance;

public class Common implements I1,I2 {

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("test2");
		
	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		System.out.println("test4");
		
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("test1");
		
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println("test3");
		
	}
	public static void main(String[] args) {
		Common co=new Common();
		co.test2();
		co.test4();
		co.test1();
		co.test3();
	}
	

	
	

}
