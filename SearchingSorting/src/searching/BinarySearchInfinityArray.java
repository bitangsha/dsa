package searching;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearchInfinityArray {
	
		
	
	public static void main(String[] args) {
	
		int[] arr = {1, 4, 9, 23, 26, 36, 48, 57, 60, 68, 74, 79, 81, 87, 105};
		//Integer[] arr2 = new Integer[arr.length]; 		
		//System.arraycopy(arr, 0, arr2, 0, arr.length);
		
		//Collections.reverse(Arrays.asList(arr2));        
		
		//System.out.println(Arrays.toString(arr));		
		//System.out.println(Arrays.toString(arr2));		
		
				
		int target=81;		
		System.out.println(calculate(arr, target));		
		//System.out.println(search(arr2, target));		
	}
	
	private static int calculate(int[] arr, int target) {
		int start=0;
		int jump=1;
		int end=start+jump;
		int tempEnd=end;
		while(target > arr[end]) {
			print(arr, start, end);
//			jump*=2;
//			end=start+jump;
//			start=tempEnd+1;
//			tempEnd+=end;
			int temp=end+1;
			end=end+(end-start+1)*2;
			start=temp;
			
		}
		print(arr, start, end);
		return binarySearch(arr, target, start, end);
		
	}
	
	private static void print(int[] arr, int start, int end) {
		System.out.println("");
		System.out.println("Start : " + start + ", End : " + end);
		for(int i=0; i<arr.length; i++) {
			if(i==start)
				System.out.print(" [ ");
			System.out.print(arr[i] + " ");
			if(i==end)
				System.out.print(" ] ");
			
		}
	}
		
	private static int binarySearch(int[] arr, int target, int start, int end) {
		
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
