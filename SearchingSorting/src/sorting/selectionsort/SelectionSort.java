package sorting.selectionsort;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] arr = {10,3,1,9,5,8,6,4,2,7}; 
		print(sort(arr));
		
	}
	
	private static int[] sort(int[] arr) {
		int max,temp,maxIndex = 0;
		for(int i=0; i<arr.length; i++) {
			max=Integer.MIN_VALUE;
			print(arr);
			for(int j=0; j<arr.length-i; j++) {
				
				max=Math.max(max, arr[j]);
				if(max==arr[j])	
					maxIndex=j;
			}
			
			if(arr[arr.length-i-1]!=max) {
				System.out.println("Max : " + max);
				System.out.println("Swapping : " + arr[maxIndex] + " and " + arr[arr.length-i-1]);
				temp=arr[maxIndex];
				arr[maxIndex]=arr[arr.length-i-1];
				arr[arr.length-i-1]=temp;				
			}		
		}	
		return arr;
	}
	
	private static void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
