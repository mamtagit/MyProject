package practice;

public class Sumvaluesofarray {
	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int i : num) {
			sum += i;
			System.out.println("the sum is" + sum);
		}

	}

}
