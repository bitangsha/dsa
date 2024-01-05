package sorting.cyclesort;

import java.util.Arrays;

public class CycleSort {
	
	public static void main(String[] args) {
		int[] arr = {10,3,1,9,5,8,6,4,2,7}; 
		print(sort(arr));
		
	}
	
	private static int[] sort(int[] arr) {
		int i=0, temp;
		while(true) {
			//System.out.println("i="+i);
			//print(arr);
			if(i==arr.length-1)
				break;
			if(arr[i]!=i+1) {
				temp=arr[i];				
				arr[i]=arr[arr[i]-1];
				arr[temp-1]=temp;
			}else {
				i++;
			}
		}
		return arr;
	}
	
	private static void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

}
