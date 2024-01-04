package sorting.insertionsort;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] arr = {10,3,1,9,5,8,6,4,2,7}; 
		print(sort(arr));
		
	}
	
	private static int[] sort(int[] arr) {
		
		int temp;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j>0; j--) {
				if(arr[j]<arr[j-1]) {
					//swap
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}else {
					break;
				}
					
			}
		}
		return arr;
		
	}
	
	private static void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

}
