package searching;

public class MountainArrayMiddleElement {
	
	public static void main(String[] args) {
		
		Integer[] arr = {1, 4, 9, 23, 26, 36, 48, 57, 60, 68, 74, 140, 54, 32, 18, 2};
	
		System.out.println(getMountainIndex(arr));				
	}
		
	private static int getMountainIndex(Integer[] arr) {
		
		int start=0, end=arr.length-1;
		
		int mid=0;
		
		
		while(start!=end) {			
			
			//calculate the mid
			mid=(start+end)/2;	
			
			System.out.println("Mid = " + arr[mid]);
			
			//search in the larger area
			if(arr[mid]>arr[mid+1])
			{
				end=mid;					
			
			//search in the smaller area
			}else {
				start=mid+1;					
			}							
		}
		return arr[end];		
	}

}
