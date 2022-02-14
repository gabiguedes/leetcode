package leetcode1;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class RemoveDuplicatesFromSortedArray26 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int[] numbers = new int[arr.size()];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = arr.get(i);
		}

		System.out.println(removeDuplicates(numbers));

		bufferedReader.close();
	}

	public static int removeDuplicates(int[] nums) {
		int i, j = 0;
		
		for (i = 1; i < nums.length; i++) {
			if (nums[i] != nums[j]) {
				nums[++j] = nums[i];
			}
		}
		
		return j + 1;

	}

}
