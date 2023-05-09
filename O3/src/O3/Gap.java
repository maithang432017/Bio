package O3;

public class Gap {
public static void main(String[] args) {
	int[] array = { 7, 4, 1, 5, 54, 15, 13, 3, 7 };
	System.out.println(minimumGap(array));
}
public static int minimumGap(int[] arr) {
	int count=0;
	int gap= arr.length;
for(int i=0; i<arr.length; i++) {
	for(int j=i+1; j<arr.length;j++) {
	if(arr[i]==arr[j]) {
		count= j-i;
		gap=count;
	}
	}
		
	}return gap;
}

}

