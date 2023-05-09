package O3;

public class Feast {
	public static void main(String[] args) {
		int n = 100, c = 4, m = 4;
		System.out.println("total candy:" + totalCandy(n, c, m));
	}

	public static int totalCandy(int n, int c, int m) {
		int candyAmount = n / c;
		int wrap = candyAmount;

		while (wrap > m) {

			int freeCandy = wrap / m;
			candyAmount += freeCandy;
			wrap = freeCandy + wrap % m;

		}
		return candyAmount;

	}

}
