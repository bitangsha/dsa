	package searching.binarysearch;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {
	
		
	
	public static void main(String[] args) {
	
		Integer[] arr = {1, 4, 9, 23, 26, 36, 48, 57, 60, 68, 74, 79, 81, 87, 105};
		Integer[] arr2 = new Integer[arr.length]; 		
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		
		Collections.reverse(Arrays.asList(arr2));        
		
		System.out.println(Arrays.toString(arr));		
		System.out.println(Arrays.toString(arr2));		
		
				
		int target=79;		
		System.out.println(search(arr, target));		
		System.out.println(search(arr2, target));		
	}
		
	private static int search(Integer[] arr, int target) {
		
		int start=0, end=arr.length-1;
		
		int mid=0;
		
		boolean asc = arr[end] > arr[start] ? true : false;
		
		while(start<=end) {			
			
			//calculate the mid
			mid=(start+end)/2;						
			
			//search in the larger area
			if(target>arr[mid])
			{
				if(asc)
					start=mid+1;
				else
					end=mid-1;
					
			
			//search in the smaller area
			}else if(target<arr[mid]) {
				if(asc)
					end=mid-1;
				else
					start=mid+1;
					
			}
			//element found
			else			
				return mid;						
		}
		return -1;		
	}
}
