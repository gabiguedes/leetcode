package leetcode1;

import java.util.Arrays;

public class SearchInsertPosition35 {

	public static boolean IS_ACHOU = false;

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6 };
		int target = 2;

		// System.out.println(searchInsert(nums, target));
		System.out.println(searchInsertI(nums, target));

	}

	public static int searchInsert(int[] nums, int target) {

		if (IS_ACHOU) {
			int resposta = pesquisaBinaria(nums, target);
			return resposta;
		} else {
			int[] arrCopy = new int[nums.length + 1];

			System.arraycopy(nums, 0, arrCopy, 0, nums.length);
			arrCopy[nums.length] = target;

			Arrays.sort(arrCopy);

			int resposta = pesquisaBinaria(arrCopy, target);

			return resposta;
		}

	}

	public static int searchInsertI(int[] nums, int target) {
		if (nums.length == 0)
			return -1;

		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}
		return left;

	}

	public static int pesquisaBinaria(int[] nums, int target) {
		Arrays.sort(nums);

		int inicio = 0, fim = nums.length - 1, meio = 0, resp = 0;

		while (inicio <= fim) {
			meio = (int) (inicio + fim) / 2;
			if (nums[meio] == target) {
				IS_ACHOU = true;
				resp = meio;
				break;
			} else if (nums[meio] < target) {
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}
		}

		return resp;
	}

}
