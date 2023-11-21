
class QuickSort {
	
	static int partition(int arr[], int start, int end) {

		int pivot = arr[end];
		int i = start-1;

		for(int j=start; j<end; j++) {

			if(arr[j] <= pivot) {

				i++;

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = temp;

		return i+1;

	}
	static void quickSort(int arr[], int start, int end) {

		if(start < end) {

			int pivotInd = partition(arr, start, end);

			quickSort(arr, start, pivotInd-1);
			quickSort(arr, pivotInd+1, end);
		}
	}
	public static void main(String[] args) {

		int arr[] = new int[] {12, 7, 6, 14, 5, 15, 10};
		
		System.out.println("Array : ");
		for(int i=0; i<arr.length; i++) {

			System.out.print(arr[i]+ "  ");
		}
		System.out.println();
		
		quickSort(arr, 0, arr.length-1);
		
		System.out.println("Sorted Array : ");
		for(int i=0; i<arr.length; i++) {

			System.out.print(arr[i]+ "  ");
		}
		System.out.println();
	}
}
