
/*
	17] SubArray : 
	
	Problem Description :
	Given an integer array of size N.
	return the length of the smallest subArray when contains both the maximum of 
	array of the minimum of array.


	Arr: [1,2,3,1,2,3,4,6,4,6,3]
*/

class Solution {
	
	static int optimizeApproach(int arr[]) {

		int minValue = Integer.MAX_VALUE;
                int maxValue = Integer.MIN_VALUE;

                for(int i=0; i<arr.length; i++) {

                        if(arr[i] < minValue) {

                                minValue = arr[i];
                        }else if(arr[i] > maxValue) {

                                maxValue = arr[i];
                        }
                }
                if(maxValue == minValue) {

                        return 1;
                };
		
		int minLength = Integer.MAX_VALUE;
		int len = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {

			for(int j=i+1; j<arr.length; j++) {

				if(arr[i] == maxValue && arr[j] == minValue) {

					 len = j - i + 1;
				}
				if(arr[i] == minValue && arr[j] == maxValue) {

					 len = j - i + 1;
				}
				if(len < minLength) {

					minLength = len;
				}
			}
		}
		return minLength;

	}
	static int bruteForceApproach(int arr[]) {
		
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;

		for(int i=0; i<arr.length; i++) {

			if(arr[i] < minValue) {

				minValue = arr[i];
			}else if(arr[i] > maxValue) {

				maxValue = arr[i];
			}
		}
		if(maxValue == minValue) {

			return 1;
		};
		
		int minLength = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == minValue) {

				for(int j=i+1; j<arr.length; j++) {
				       	
					if(arr[j] == maxValue) {

						int len = j-i+1;
						if(minLength > len) {

							minLength = len;
						}
					}
				}
			}else if(arr[i] == maxValue) {

				for(int j=i+1; j<arr.length; j++) {

					if(arr[j]== minValue) {

						int len = j-i+1;
						if(minLength > len) {

							minLength = len;
						}
					}
				}
			}
		}
		return minLength;
	}
	public static void main(String[] args) {

		int arr[] = new int[] {1,2,3,1,2,3,4,6,4,6,3};

		int bruteForceLength = bruteForceApproach(arr);
		System.out.println("Minimum length of subArray is : "+bruteForceLength);
		
		int optimizeLength = optimizeApproach(arr);
		System.out.println("Minimum length of subArray is : "+optimizeLength);
	}
}
