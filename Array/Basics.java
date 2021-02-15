public class Basics {
	
	
	public static void main(String[] args) {
		
		// Define Array
		int[] arr = new int[5];
		
		int[] arr1 = {1, 2, 3, 4, 5, 3};
		
		// Sorting Array
		Arrays.sort(arr1);
		
		for(int val: arr1) {
			System.out.println(val);
			
		}
		
		//Get the Max and Min value of an Integer
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Integer.MIN_VALUE);
		

		return;
	}

}