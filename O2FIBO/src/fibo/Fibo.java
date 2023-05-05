package fibo;

public class Fibo {
	public static int[] fibonaccicache;

	public static void main(String[] args) {
		int num = 6;
		int s=num+1;
		fibonaccicache = new int[s + 1];
		System.out.println(fibonacci(s));
	}

	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		
		int fibonacci = fibonacci(n - 1) + fibonacci(n - 2);
		fibonaccicache[n] = fibonacci;
		return fibonacci;
	}
}
