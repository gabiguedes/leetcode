package leetcode1;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String s = in.next();
		isValid(s);

		in.close();
	}

	public static boolean isValid(String s) {
		Stack<Character> pilha = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == ')') {// verifique o tipo de colchete de fechamento
				if (pilha.isEmpty() || pilha.peek() != '(') {// se a pilha estiver vazia ou o topo não corresponder ao colchete de fechamento
					return false;
				} else {
					pilha.pop();
				}
			} else if (ch == ']') {
				if (pilha.isEmpty() || pilha.peek() != '[') {
					return false;
				} else {
					pilha.pop();
				}
			} else if (ch == '}') {
				if (pilha.isEmpty() || pilha.peek() != '{') {
					return false;
				} else {
					pilha.pop();
				}
			} else {// se houver suportes de abertura, empurre
				pilha.push(ch);
			}
		}

		return pilha.isEmpty();// se todos os pares estiverem presentes, isso resultará em verdadeiro, caso contrário, resultará em falso

	}
}
