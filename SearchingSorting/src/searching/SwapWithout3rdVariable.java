package searching;

public class SwapWithout3rdVariable {
	
	public static void main(String[] args) {
		
		int x=29;
		int y=36;
		
		x=x+y;		
		y=(x-y);
		x=(x-y);
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		
	}

}
