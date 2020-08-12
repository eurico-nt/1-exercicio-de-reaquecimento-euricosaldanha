package br.pucrs.alav;

public class Recursion {

	public static void main(String[] args) {
		System.out.println(exerc3(2));
	}

	public static int exerc1(int a, int b) {
		return exerc1aux(a, b);
	}

	private static int exerc1aux(int i, int b) {
		if (i == 0)
			return 0;
		return b + exerc1aux(i - 1, b);
	}

	public static int exerc2(int a, int b) {
		return exerc2aux(a, b);
	}

	private static int exerc2aux(int a, int b) {
		int m = 0;
		int n = 0;

		m = somaM(a, 0);
		n = somaN(0, b);
		return m + n;
	}

	private static int somaM(int a, int i) {
		if (a == 0)
			return 0;
		if (a == 1)
			return 1;
		return 1 + somaM(a - 1, 0);
	}

	private static int somaN(int i, int b) {
		if (b == 0)
			return 0;
		return 1 + somaN(0, b - 1);
	}

	public static float exerc3(int n) {
		return exerc3aux(n);
	}

	private static float exerc3aux(int n) {
		if (n == 0)
			return 0;
		return ((float)1 / n) + exerc3aux(n - 1);
	}

	public static String exerc4(String a) {
		return revStrg(a);		
	}
	private static String revStrg(String a) {
		if(a.isEmpty()) {
			System.out.println("String vazia");
			return a;
		}
		System.out.println("Invertendo String: " + a.substring(1));
		return revStrg(a.substring(1) + a.charAt(0));
	}
	
	public static float exerc5(float n) {
		if(n == 1)
			return 1;
		if(n == 2)
			return 2;
		else
			return 2 * exerc5(n - 1) + 3 * exerc5(n - 2);
	}
	
	public static int exerc6(int m, int n) {
		if(m == 0)
			return n + 1;
		if(m != 0 && n == 0)
			return exerc6(m - 1, n);
		if(m != 0 && n != 0)
			return exerc6(m - 1, exerc6(m, n - 1));
		else return 0;		
	}
	
	public static int exerc7(int [] m) {
		return somaVet(m) + multVet(m);
	}
	
	private static int somaVet(int [] i) {
		int sum = 0;
		if(i.length == 0)
			return sum;
		if(i.length > 0)
			return sum + i[i.length - 1];
		else
			return sum + somaVet(i.length - 1);
	}
	
	private static int multVet(int n) {
		return n;
	}
	
}

