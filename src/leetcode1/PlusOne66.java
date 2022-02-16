package leetcode1;

public class PlusOne66 {

	public static void main(String[] args) {
		int[] digits = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 9 };

		System.out.println(plusOne(digits));
	}

	public static int[] plusOne(int[] digits) {
		int rem = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			int tmp = digits[i] + rem;
			digits[i] = tmp % 10;
			rem = tmp / 10;
		}
		if (rem != 0) {
			int arr[] = new int[digits.length + 1];
			arr[0] = rem;
			for (int i = 1; i < arr.length; i++) {
				arr[i] = digits[i - 1];
			}
			return arr;
		}

		return digits;
	}
}
