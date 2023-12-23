
/*

   Program 9 : WAP to print string in reverse order.

*/

class Solution {
	
	char[] usingforLoop(String str) {

		int start = 0;
		int end = str.length()-1;

		char carr[] = str.toCharArray();

		while(start < end) {

			char temp = carr[start];
			carr[start] = carr[end];
			carr[end] = temp;

			start++;
			end--;
		}
		return carr;
	}
	public static void main(String[] args) {
		
		Solution obj = new Solution();

		System.out.println("Using forloop");
		System.out.println(obj.usingforLoop("Manish"));
	}
}
