package O3;

public class Gap {
public static void main(String[] args) {
	int[] array = { 7, 4, 1, 5, 12, 15, 1, 3, 7 };
	System.out.println(minimumGap(array));
}
public static int minimumGap(int[] arr) {
	int gap = 0;
	int indexI = 0, indexJ = 0;
	int j = arr.length - 1;
	for (int i = 0; j > i; i++, j--) {

		if (arr[i] - arr[j] == 0) {
			indexI = i;
			indexJ = j;
			gap = indexJ - indexI;
		}
		if (arr[i] - arr[j] != 0) {
			gap++;
		}
		gap = indexJ - indexI;
	}
	return gap;
}

}

