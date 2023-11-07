

class BubbleSort {
	
	void bubbleSortUsingRecursion(int arr[], int N) {
		
		if(N == 1)

			return;

		boolean swapped = false;

		for(int i=0; i<N; i++) {

			if(arr[i] > arr[i+1]) {

				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				swapped = true;
			}
		}
		if(swapped == false)

			return;

		bubbleSortUsingRecursion(arr, N-1);
	}
	public static void main(String[] args) {

		int arr[] = new int[] {7, 3, 9, 4, 2, 5, 6};

		BubbleSort bs = new BubbleSort();
		
		System.out.println("Given array : ");
		for(int i=0; i<arr.length; i++) {

			System.out.print(arr[i]+ "  ");
		}
		System.out.println();

		bs.bubbleSortUsingRecursion(arr, arr.length-1);

		System.out.println("Sorted array using recursion bubble sort : ");
		for(int i=0; i<arr.length; i++) {

			System.out.print(arr[i]+ "  ");
		}
		System.out.println();
	}
}
