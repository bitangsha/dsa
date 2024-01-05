package sorting.cyclesort;

import java.util.Arrays;

public class CycleSort {
	
	public static void main(String[] args) {
		int[] arr = {10,3,1,9,5,8,6,4,2,7}; 
		print(sort(arr));
		
	}
	
	private static int[] sort(int[] arr) {
		int i=0;
		while(true) {
			if(i==arr.length-1)
				break;
			if(arr[i]!=i+1) {
				swap(arr, i, arr[i]-1);
			}else {
				i++;
			}
		}
		return arr;
	}
	
	private static void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	private static void swap(int[] arr, int pos1, int pos2) {
		int temp=arr[pos1];
		arr[pos1]=arr[pos2];
		arr[pos2]=temp;
	}

}
