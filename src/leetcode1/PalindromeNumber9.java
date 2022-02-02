package leetcode1;

import java.util.Scanner;

public class PalindromeNumber9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int x = in.nextInt();
		System.out.println(isPalindrome(x));

		in.close();
	}

	public static boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		int reversed = 0, remainder, original = x;
		while (x != 0) {
			remainder = x % 10; // o inteiro invertido é armazenado na variável
			reversed = reversed * 10 + remainder; // multiplique invertido por 10, em seguida, adicione o restante para que seja armazenado em
													// próxima casa decimal
			x /= 10; // o último dígito é removido de num após a divisão por 10.
		}
		// palíndromo se original e reverso são iguais
		return original == reversed;

	}

}
