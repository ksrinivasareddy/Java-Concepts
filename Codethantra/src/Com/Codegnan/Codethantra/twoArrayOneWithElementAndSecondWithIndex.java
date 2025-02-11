package Com.Codegnan.Codethantra;

public class twoArrayOneWithElementAndSecondWithIndex {
	public static void main(String args[]) {
		int arr[] = {10,20,30,40,50};
		int[] ar = {2,3,4};
		for(int index : ar) {
			if(index >= 0 && index < arr.length) {
				System.out.println(arr[index]);
			}
		}
		
	}
}
