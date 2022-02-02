package leetcode1;

import static java.util.Map.entry;

import java.util.Map;
import java.util.Scanner;

public class RomanToInteger13 {

	 private static Map<Character, Integer> map = Map.ofEntries(
	         entry('I', 1),
	         entry('V', 5),
	         entry('X', 10),
	         entry('L', 50),
	         entry('C', 100),
	         entry('D', 500),
	         entry('M', 1000)
	    );

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String s = in.next();

		System.out.println(romanToInt(s));

		in.close();
	}

	public static int romanToInt(String s) {
		var size = s.length();
		int aux = 0,sum=0;
		
		//for para pegar os charcters do final ao inicio
		for (int i = size - 1; i >= 0; i--) {
			var str = s.charAt(i);
			int valor = map.get(str);
			
			if (aux != 0 && aux > valor) {
				sum -= valor;
			} else {
				sum += valor;
			}
			
			aux = valor;
		}
		
		return sum;
	}

}
