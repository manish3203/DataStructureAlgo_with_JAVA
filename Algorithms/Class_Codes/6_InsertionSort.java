
class Insertion {

	public static void main(String[] args) {

		int arr[] = new int[] {7, 3, 5, 1, 3, 8, 2};
		
		System.out.println("Givem array : ");
		for(int i=0; i<arr.length; i++) {

			System.out.print(arr[i]+"  ");
		}
		System.out.println();


		for(int i=0; i<arr.length; i++) {

			int element = arr[i];
			int j = i-1;

			while((j >= 0) && (arr[j] > element)) {

				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = element;
		}
		
		System.out.println("sorting using insertion algorithm : ");
		for(int i=0; i<arr.length; i++) {

			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
}

/*
 *
 *	Time Complexity : O(N^2)
 *	Spcae Complexity : O(1)
 *
 *
 */
