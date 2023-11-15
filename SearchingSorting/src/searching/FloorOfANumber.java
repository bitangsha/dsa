package searching;

public class FloorOfANumber {
	
	/*
	 * Floor of a number is the maximum number which is smaller than or equals to that number
	 */
	
	public static void main(String[] args) {
		Integer[] arr = {1, 4, 9, 23, 26, 36, 48, 57, 60, 68, 74, 79, 81, 87, 105};
		int target = 57;
		
		System.out.println(arr[floor(arr, target)]); 
		
	}
	
	private static int floor(Integer[] arr, int target) {
		
		int start=0, end=arr.length-1;
		
		int mid;
		
		while(start<=end) {
			
			mid=(start+end)/2;
			
			//System.out.println(arr[mid]);
			
			if(target > arr[mid]) {
				start=mid+1;
			} else if (target < arr[mid]) {
				end=mid-1;
				
			} else {
				return mid;
			}			
		}
		
		/*
		 * At this point, start and end will cross each other. so, start > end 
		 */
		return (end);
		
		
	}
	

}
