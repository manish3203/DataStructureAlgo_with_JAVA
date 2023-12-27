
/*

   Valid parenthesis or parenthesis checker

   - Given an expression string x.
   - Examine whether the pairs and the orders of {,},(,),[,] are correct in exp.
   - For example, the function should return 'true' for exp = [()]{}{[()()]()}
     and 'false' for exp = [(]).

     Note : The drive code prints "balanced" if function return true, otherwise
            it prints "not balanced".

   Example 1:
   Input:
  	{([])}

   Output:
	true


  Example 2:
  Input:
	()

  Output:
	true


  Example 3:
  Input:
	([]

  Output:
	false

*/

import java.util.*;

class ParenthesisChecker {
	
	boolean validParenthesis(String str) {
	
		Stack<Character> s = new Stack<Character>();

		for(int i=0; i<str.length(); i++) {

			char ch = str.charAt(i);

			if(ch == '(' || ch == '{' || ch == '[') {

				s.push(ch);
			}else {

				if(!s.empty()) {
					
					char check = s.peek();
					
					if((check == '(' && ch == ')') || (check == '{' && ch == '}') || (check == '[' && ch == ']')){

						s.pop();
					}else {

						return false;
					}
				}else {

					return false;
				}
			}
		}

		if(s.empty()) {
		
			return true;
		}else {

			return false;
		}
	}

}

class Client {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter expression :");
		String str = sc.next();

		ParenthesisChecker pc = new ParenthesisChecker();

		boolean ret = pc.validParenthesis(str);

		if(ret)

			System.out.println("Balanced");
		else

			System.out.println("Not Balanced");

	}
}
