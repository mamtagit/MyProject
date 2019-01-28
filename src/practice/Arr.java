package practice;

public class Arr {

	public static void main(String[] args) {
		int num[] = new int[5];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[4] = 5;
		num[3] = 4;
		num[1] = 200;
		for (int len : num) {
			System.out.println(len);

		}
	}
}