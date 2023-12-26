
//two stack using an array
	
import java.util.*;

class TwoStacks {
	
	int stackArr[];
	int top1;
	int top2;
	int maxSize;
	TwoStacks(int size) {

		this.stackArr = new int[size];
		this.top2 = size;
		this.top1 = -1;
		this.maxSize = size;
	}

	void push1(int data) {

		if(top2-top1 > 1) {
			
			top1++;
			stackArr[top1] = data;
		}else {

			System.out.println("Stack overflow");
		}
	}
	
	void push2(int data) {

		if(top2-top1 > 1) {
			
			top2--;
			stackArr[top2] = data;
		}else {

			System.out.println("Stack overflow");
		}
	}

	int pop1() {

		if(top1 == -1) {

			System.out.println("Stack 1 empty. . .");
			return -1;
		}else {

			int val = stackArr[top1];
			top1--;

			return val;
		}
	}
	
	int pop2() {

		if(top2 == maxSize) {

			System.out.println("Stack 2 empty. . .");
			return -1;
		}else {

			int val = stackArr[top2];
			top2++;

			return val;
		}
	}

	void printStack1() {

		if(top1 == -1) {

			System.out.println("Stack 1 empty. . .");
			return;
		}else {

			System.out.print("[ ");
			for(int i=0; i<=top1; i++) {

				if(i < top1)

					System.out.print(stackArr[i]+", ");
				else

					System.out.println(stackArr[i]+" ]");
			}
		}
	}
	
	void printStack2() {

		if(top2 == maxSize) {

			System.out.println("Stack 2 empty. . .");
			return;
		}else {

			System.out.print("[ ");
			for(int i=maxSize-1; i>=top2; i--) {

				if(i > top2)

					System.out.print(stackArr[i]+", ");
				else

					System.out.println(stackArr[i]+" ]");
			}
		}
	}
}

class Client {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of an array : ");
		int size = sc.nextInt();

		TwoStacks ts = new TwoStacks(size);
		
		char ch;
		do {

			System.out.println("1. push1");
			System.out.println("2. push2");
			System.out.println("3. pop1");
			System.out.println("4. pop2");
			System.out.println("5. printStack1");
			System.out.println("6. printStack2");

			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch(choice) {

				case 1 : {

						 System.out.println("Enter element for stack 1 :");
						 int data = sc.nextInt();

						 ts.push1(data);
					}
					break;

				case 2 : {

						 System.out.println("Enter element for stack 2 :");
						 int data = sc.nextInt();

						 ts.push2(data);
					}
					break;

				case 3 : {

						 int ret = ts.pop1();

						 if(ret != -1) {

							 System.out.println(ret+" popped from stack 1");
						 }
					}
					break;
				
				case 4 : {

						 int ret = ts.pop2();

						 if(ret != -1) {

							 System.out.println(ret+" popped from stack 2");
						 }
					}
					break;

				case 5 :

					ts.printStack1();
					break;

				case 6 :

					ts.printStack2();
					break;

				default :

					System.out.println("Wrong choice");
					break;
			}

			System.out.println("Do you want to continue ?");
			ch = sc.next().charAt(0);

		}while(ch == 'Y' || ch == 'y');
	}
}
