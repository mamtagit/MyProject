package practice;

public class StrDemo {
	public static void main(String[] args) {
		String a = "arun";
		String b = "aRun";
		String c = "mamta";
		boolean x = a.equalsIgnoreCase(b);
		System.out.println(x);
		boolean y = a.equalsIgnoreCase(c);
		System.out.println(y);
	}
}
