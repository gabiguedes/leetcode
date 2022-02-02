package leetcode1;

import java.io.IOException;

public class TwoSumIIInputArrayIsSorted167 {

	public static void main(String[] args) throws IOException {
		int[] cost = { 2, 7, 11, 15 };

		int target = 9;
		System.out.println(twoSum(cost, target));

	}

	public static int[] twoSum(int[] numbers, int target) {
		int i = 0, j = numbers.length - 1;

		while (i < j) {
			if (numbers[i] + numbers[j] == target) {
				//System.out.println((i+1) + " " + (j+1));
				//return new int[] { i + 1, j + 1 };
			} else if (numbers[i] + numbers[j] < target) {
				i++;
			} else {
				j--;
			}
		}
		return new int[] {i + 1, j + 1 };
	}

}
