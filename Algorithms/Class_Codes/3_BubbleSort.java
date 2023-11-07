//normal approach

class BubbleSort {

	public static void main(String[] args) {

		int arr[] = new int[] {7, 3, 9, 4, 2, 5, 6};

		for(int i=0; i<arr.length; i++) {

			for(int j=0; j<arr.length-1; j++) {

				if(arr[j] > arr[j+1]) {

					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		//print sorted array
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
 *
 */
