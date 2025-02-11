package Arrays.com.codegnan;

public class CountOfCommonElementsAtIndexPLaceOfTwoArrays {

	public static void main(String[] args) {
		int a[] = {1,1,4,2,1,3};
		int b[] = {1,1,1,2,3,4};
		int count = 0;
		for(int i = 0;i<a.length;i++) {
			if(a[i] == b[i]) {
				count++;
			}
		}
		System.out.println(count);
	}

}
