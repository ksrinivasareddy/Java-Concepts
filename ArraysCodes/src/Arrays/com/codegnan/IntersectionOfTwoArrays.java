package Arrays.com.codegnan;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int a[] = {100,153,56,176,235,89};
		int b[] = {45,18,56};
		for(int i = 0; i < a.length;i++) {
			for(int j = 0; j < b.length;j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
