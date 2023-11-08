
class SelectionSort {

	public static void main(String[] args) {

		int arr[] = new int[] {9, 2, 7, 3, 5, 4, 6};

		System.out.println("given array : ");
		for(int i=0; i<arr.length; i++) {

			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		
		for(int i=0; i<arr.length-1; i++) {

			int minIndex = i;

			for(int j=i+1; j<arr.length; j++) {

				if(arr[j] < arr[minIndex]) 

					minIndex = j;
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

		System.out.println("Sorted array using selection sort : ");
		for(int i=0; i<arr.length; i++) {

			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
}

/*

	given array : 
	9  2  7  3  5  4  6  
	Sorted array using selection sort : 
	2  3  4  5  6  7  9  

*/
