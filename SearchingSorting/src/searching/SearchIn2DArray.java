package searching;

import java.util.Arrays;

public class SearchIn2DArray {
	
	public static void main(String[] args) {
		
		int[][] arr = {
				{10,34,67,76},
				{94,55,73,56},
				{48,29,3,103},
				{32,99,43,53}
		};
		int target=43;
		System.out.println("Index of " + target + " : " + Arrays.toString(search(arr, target)));
		System.out.println("Max : " + max(arr));
		System.out.println("Min : " + min(arr));
		
	}
	
	private static int[] search(int[][] arr, int target) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]==target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}
	
	private static int max(int[][] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];					
				}
			}
		}
		return max;
	}
	
	private static int min(int[][] arr) {
		int min=Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]<min) {
					min=arr[i][j];					
				}
			}
		}
		return min;
	}
	
	

}
