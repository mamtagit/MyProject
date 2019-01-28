package practice;

public class Laptop1 {
	public static void main(String[] args) {
		String s1 = "mamta";
		String s2 = "mamta";
		System.out.println("literal string");
		System.out.println("system.IdentityHashCode(s1)");
		System.out.println("system.IdentityHashCode(s2)");
		String s3 = new String("mamta");
		String s4 = new String("mamta");
		System.out.println("non literal string");
		System.out.println("system.IdentityHashCode(s3)");
		System.out.println("system.IdentityHashCode(s4)");

	}
}
