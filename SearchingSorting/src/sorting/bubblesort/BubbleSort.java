package sorting.bubblesort;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr = {10,3,1,9,5,8,6,4,2,7}; 
		System.out.println(Arrays.toString(sort(arr)));
		
	}
	
	private static int[] sort(int[] arr) {
		int temp;
		boolean swapped=false;
		for(int i=0; i<arr.length-1; i++) {					
			for(int j=1; j<arr.length-i; j++) {	
				swapped=false;
				//System.out.println("j is now : "+j);
				if(arr[j]<arr[j-1]) {
					//swap									
					//System.out.println("Swapping "+arr[j] +" and " + arr[j-1]);
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped=true;
				}
			}
			if(!swapped) break;
		}
		return arr;
	}

}
