package arrays;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {10,15,20,180,11,0};
		System.out.println(Arrays.toString(ar));
		//Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.binarySearch(ar, 180));
		int b[]=Arrays.copyOf(ar, ar.length +2);
		System.out.println(Arrays.toString(b));
		
		int c[]=Arrays.copyOfRange(ar, 4, 6);
		//Arrays.fill(c, 3); can only be used at the intilisation of the array.
		System.out.println(Arrays.toString(c));
		
		
		Arrays.parallelSort(ar);
		System.out.println(Arrays.toString(ar));
		
		
		
	}

}
