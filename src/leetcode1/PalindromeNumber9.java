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
			remainder = x % 10; // o inteiro invertido � armazenado na vari�vel
			reversed = reversed * 10 + remainder; // multiplique invertido por 10, em seguida, adicione o restante para que seja armazenado em
													// pr�xima casa decimal
			x /= 10; // o �ltimo d�gito � removido de num ap�s a divis�o por 10.
		}
		// pal�ndromo se original e reverso s�o iguais
		return original == reversed;

	}

}
