package leetcode1;

public class MaximumSubarray53 {

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		maxSubArray(nums);
	}

	//algoritmo de Kadane O(n)
	public static int maxSubArray(int[] nums) {
		int size = nums.length;
		int somaSegmentosContinuosPositivos = Integer.MIN_VALUE, segmentosContinuosPositivos = 0;
		
		for(int i = 0; i<size; i++) {
			segmentosContinuosPositivos += nums[i];
			if(somaSegmentosContinuosPositivos < segmentosContinuosPositivos) 
				somaSegmentosContinuosPositivos = segmentosContinuosPositivos;
			if(segmentosContinuosPositivos < 0) 
				segmentosContinuosPositivos = 0;
		}
		
		return somaSegmentosContinuosPositivos;
	}
}
