package Arrays.com.codegnan;

import java.util.Arrays;

public class MediamOfTwoSortedArrays {

	public static void main(String[] args) {
		   int a[] = {1,2,5};
	       int b[] = {3,4};
	       int count = 0;
	       int length = a.length + b.length;
	       int mergeArray[] = new int[length];
	       for(int element : a){
	           mergeArray[count] = element;
	           count++;
	       }
	       for(int element : b){
	           mergeArray[count] = element;
	           count++;
	       }
	       
	       for(int i = 0; i < mergeArray.length;i++) {
	    	   for(int j = i + 1; j < mergeArray.length;j++) {
	    		   if(mergeArray[i] > mergeArray[j]) {
	    			   int temp = mergeArray[i];
	    			   mergeArray[i] = mergeArray[j];
	    			   mergeArray[j] = temp;
	    		   }
	    	   }
	       }
	       System.out.println(Arrays.toString(mergeArray));
	       double mid = mergeArray.length / 2;
	       System.out.println(mid);
	       if(mid % 2 == 0) {
	    	   System.out.println((double)(mergeArray[(int) (mid-1)]+mergeArray[(int) mid])/2);
	       }
	       else {
	    	   System.out.println(mergeArray[(int) mid]);
	       }
	}      

}
