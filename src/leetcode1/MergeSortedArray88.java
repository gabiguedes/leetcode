package leetcode1;

public class MergeSortedArray88 {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };

		int m = 3;
		int n = 3;

		merge(nums1, m, nums2, n);

	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		// mesclando a partir do final das matrizes
		int availableIndex = nums1.length -1;
		m--; // usando m como ponteiro em nums1 próximo valor
		n--; // usando n como ponteiro em nums1 próximo valor
		while(m >=0 && n >=0){
			if(nums1[m] >= nums2[n]){
				nums1[availableIndex] = nums1[m];
				m--;
			}else{
				nums1[availableIndex] = nums2[n];
				n--;
			}
			availableIndex--;
		}
		
		while(n >= 0){
			nums1[availableIndex] = nums2[n];
			n--;
			availableIndex--;
		}
		// se m>=0, então não há necessidade de fazer o loop acima porque
		// esses números estão na posição certa em nums1
	}

}
