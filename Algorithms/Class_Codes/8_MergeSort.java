
class MergeSort {
	
	void merge(int arr[], int start, int mid, int end) {

		int N1 = mid-start+1;
		int N2 = end-mid;

		int arr1[] = new int[N1];
		int arr2[] = new int[N2];

		for(int i=0; i<arr1.length; i++) {
			
			arr1[i] = arr[start+i];
		}

		for(int j=0; j<arr2.length; j++) {

			arr2[j] = arr[mid+j+1];
		}

		int i=0, j=0, k=start;

		while(i < arr1.length && j < arr2.length) {

			if(arr1[i] <= arr2[j]) {

				arr[k] = arr1[i];
				i++;
			}else {

				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
		while(i < arr1.length) {

			arr[k] = arr1[i];
			k++;
			i++;
		}
		while(j < arr2.length) {

			arr[k] = arr2[j];
			k++;
			j++;
		}
	}
	void mergeSort(int arr[], int start, int end) {
	
		if(start < end) {

			int mid = start + (end-start) / 2;

			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);

			merge(arr, start, mid, end);
		}
	}
	public static void main(String[] args) {

		int arr[] = new int[] {9, 1, 8, 2, 7, 3, 6, 4};
		
		System.out.println("Given array : ");
		for(int i=0; i<arr.length; i++) {

			System.out.print(arr[i]+"  ");
		}
		System.out.println();

		MergeSort ms = new MergeSort();

		ms.mergeSort(arr, 0, arr.length-1);

		System.out.println("Sorting using merge sort algo : ");
		for(int i=0; i<arr.length; i++) {

			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}

}
