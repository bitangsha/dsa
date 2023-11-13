package searching;

public class CeilingOfANumber {
	
	/*
	 * Ceiling of a number is the minimum number which is greater than or equals to that number
	 */
	
	public static void main(String[] args) {
		Integer[] arr = {1, 4, 9, 23, 26, 36, 48, 57, 60, 68, 74, 79, 81, 87, 105};
		int target = 59;
		
		System.out.println(arr[ceiling(arr, target)]); 
		
	}
	
	private static int ceiling(Integer[] arr, int target) {
		
		int start=0, end=arr.length-1;
		
		int mid;
		
		while(start<=end) {
			
			mid=(start+end)/2;
			
			if(target > arr[mid]) {
				start=mid+1;
			} else if (target < arr[mid]) {
				end=mid-1;
				
			} else {
				return mid;
			}			
		}
		
		/*
		 * At this point, start and end will cross each other. so, start > end		 * 
		 */
		return (start);
		
		
	}
	

}
