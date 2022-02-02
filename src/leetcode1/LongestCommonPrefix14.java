package leetcode1;

import java.util.Arrays;

public class LongestCommonPrefix14 {

	public static void main(String[] args) {

		String[] palavras = { "ab", "a" };

		longestCommonPrefix(palavras);

	}

	public static String longestCommonPrefix(String[] strs) {
		Arrays.sort(strs);
		int i;
		for (i = 0; i < strs[0].length(); i++) {
			if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
				continue;
			} else {
				break;
			}
		}
		if (i > 0)
			return strs[0].substring(0, i);
		else
			return "";
	}

}
