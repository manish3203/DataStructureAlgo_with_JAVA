
/*
 	16] Equillibrium index of an array

*/

class Solution {
	
	static int optimizeApproach(int arr[]) {

		int psArr[] = new int[arr.length];

		psArr[0] = arr[0];

		for(int i=1; i<psArr.length; i++) {

			psArr[i] = psArr[i-1] + arr[i];
		}
		
		arr[arr.length-1] = arr[arr.length-1];
		for(int i=arr.length-2; i>=0; i--) {

			arr[i] = arr[i+1] + arr[i];
		}

		for(int i=0; i<arr.length; i++) {

			if(psArr[i] == arr[i]) {

				return i;
			}
		}
		return -1;
	}
	static int bruteForceApproach(int arr[]) {

		for(int i=0; i<arr.length; i++) {

			int leftSum = 0;
			int rightSum = 0;

			for(int j=0; j<i; j++) {

				leftSum = leftSum + arr[j];
			}
			for(int k=i+1; k<arr.length; k++) {

				rightSum = rightSum + arr[k];
			}

			if(leftSum == rightSum) {

				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {

		int arr[] = new int[] {1,2,0,3};

		int bruteforceIndex = bruteForceApproach(arr);
		System.out.println("bruteForceApproach : "+bruteforceIndex);
		
		int optimizeIndex = optimizeApproach(arr);
		System.out.println("optimizeApproach : "+optimizeIndex);
	}
}
