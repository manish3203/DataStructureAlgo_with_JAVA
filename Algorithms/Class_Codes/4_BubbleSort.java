

class BubbleSort {
	
	void sortUsingBubbleAlgo(int arr[]) {
		
		boolean swapped;

		for(int i=0; i<arr.length; i++) {
			
			swapped = false;
			for(int j=0; j<arr.length-i-1; j++) {

				if(arr[j] > arr[j+1]) {

					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if(swapped == false)

				return;
		}
	}
	public static void main(String[] args) {

		int arr[] = new int[] {7, 3, 9, 4, 2, 5, 6};

		BubbleSort bs = new BubbleSort();
		
		System.out.println("Given array : ");
		for(int i=0; i<arr.length; i++) {

			System.out.print(arr[i]+ "  ");
		}
		System.out.println();

		bs.sortUsingBubbleAlgo(arr);

		System.out.println("Sorted array using bubble sort : ");
		for(int i=0; i<arr.length; i++) {

			System.out.print(arr[i]+ "  ");
		}
		System.out.println();
	}
}


/*
 *
 *	Time Complexity : O(N^2)
 *	Space Complexity : O(1)
 *
 */
