package searching;

public class SearchInRotatedArray {
	
	public static void main(String[] args) {
		
		int[] arr = {3,1};
		System.out.println(findPivot(arr));
		
	}
	
	
	  public static int findPivot(int[] arr){
	        int start=0, end=arr.length-1;
	        int mid;

	        while(start<=end){
	            mid=(start+end)/2;

	            if(mid<end && arr[mid]>arr[mid+1]){
	                return mid;
	            }

	            if(mid>start && arr[mid]<arr[mid-1]){
	                return mid-1;
	            }

	            if(arr[mid]>arr[start]){
	                
	                start=mid+1;
	            }else{
	            	end=mid-1;
	            }

	        }
	        return -1;
	    }

}
