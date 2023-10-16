
/*
	18] Given an array of size N.
	    Total number of subArray possible ?

*/

class countSubArray {
	
	static int bruteForceApproach(int arr[]) {
		
		int count = 0;

		for(int i=0; i<arr.length; i++) {

			for(int j=i; j<arr.length; j++) {

				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {

		int arr[] = new int[] {4,2,10,3,12,-2,15};

		int count1 = bruteForceApproach(arr);

		System.out.println("Count : "+count1);
	}
}
