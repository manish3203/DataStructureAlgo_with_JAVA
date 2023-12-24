
import java.util.*;

class StackDemo {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<Integer>();

		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);

		System.out.println(s);  //[10 20 30 40]

		System.out.println(s.size());  //4
		System.out.println(s.empty());  //false

		System.out.println(s.pop()); //40
		System.out.println(s.peek()); //30
		
		System.out.println(s);  //[10 20 30]
		
		System.out.println(s.pop()); //30
		System.out.println(s);  //[10 20]

		s.pop();
		s.pop();
		
		System.out.println(s.empty());  //true
	}
}

