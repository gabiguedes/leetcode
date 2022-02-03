package leetcode1;

public class MergeTwoSortedLists21 {

	int val;

	// ListNode
	MergeTwoSortedLists21 next;

	MergeTwoSortedLists21() {}

	MergeTwoSortedLists21(int val) {
		this.val = val;
	}

	MergeTwoSortedLists21(int val, MergeTwoSortedLists21 next) {
		this.val = val;
		this.next = next;
	}

}

class Solution {

	public MergeTwoSortedLists21 mergeTwoLists(MergeTwoSortedLists21 list1, MergeTwoSortedLists21 list2) {
		MergeTwoSortedLists21 head = new MergeTwoSortedLists21(-1);
		
		if (list1 == null) {
			return list2;
		}
		
		if (list2 == null) {
			return list1;
		}
		
		MergeTwoSortedLists21 temp = head;
		
		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				temp.next = list1;
				list1 = list1.next;
			} else {
				temp.next = list2;
				list2 = list2.next;
			}
			
			temp = temp.next;
		}

		temp.next = (list1 == null) ? list2 : list1;

		return head.next;
	}

}