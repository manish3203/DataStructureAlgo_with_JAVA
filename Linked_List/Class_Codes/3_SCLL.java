
//singly circular linked list

import java.util.*;

class Node {

	int data;
	Node next = null;

	Node(int data) {

		this.data = data;
	}
}

class LinkedList {

	Node head = null;
	
	//addFirst
	void addFirst(int data) {

		Node newNode = new Node(data);

		if(head == null) {

			head = newNode;
			newNode.next = head;
		}else {

			Node temp = head;

			while(temp.next != head){
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.next = head;
			head = newNode;

		}
	}

	//addLast
	void addLast(int data) {

		Node newNode = new Node(data);

		if(head == null) {

			head = newNode;
			newNode.next = head;
		}else {

			Node temp = head;

			while(temp.next != head) {

				temp = temp.next;
			}
			temp.next = newNode;
			newNode.next = head;
		}
	}

	//addAtPos
	void addAtPos(int pos, int data) {

		if(pos <= 0 || pos >= countNode()+2) {

			System.out.println("Wrong Input ....!");
		}else {

			if(head == null) {

				System.out.println("Empty linkedlist. ");
			}else if(pos == 1) {

				addFirst(data);
			}else if(pos == countNode()+1) {

				addLast(data);
			}else {

				Node newNode = new Node(data);

				Node temp = head;

				while(pos-2 != 0) {

					temp = temp.next;
					pos--;
				}
				newNode.next = temp.next;
				temp.next = newNode;
			}
		}
	}

	//deleteFirst
	void deleteFirst() {

		if(head == null) {

			System.out.println("Empty linkedlist. ");
			return;
		}else if(head.next == head) {

			head = null;
		}else {

			Node temp = head;

			while(temp.next != head) {
				
				temp = temp.next;
			}
			head = head.next;
			temp.next = head;
		}
	}


	//deleteLast
	void deleteLast() {

		if(head == null) {

			System.out.println("Empty linkedlist. ");
			return;
		}else if(head.next == head) {
		
			head = null;
		}else {
		
			Node temp = head;

			while(temp.next.next != head){
				
				temp = temp.next;
			}
			temp.next = head;
		}
	}

	//deleteAtPos
	void deleteAtPos(int pos) {

		if(pos <= 0 || pos >= countNode()+1) {

			System.out.println("Wrong Input ....! ");
		}else {
		
			if(head.next == head){
			
				head = null;
			}else if(pos == 1) {
			
				deleteFirst();
			}else if(pos == countNode()) {
			
				deleteLast();
			}else {
			
				Node temp1 = head;
				Node temp2 = head;

				while(pos-2 != 0){

					temp1 = temp1.next;
					pos--;
				}
				temp2 = temp1.next;
				temp1.next = temp2.next;
			}
		}
	}

	//countNode
	int countNode() {

		Node temp = head;
		int count = 0;

		while(temp.next != head) {

			count++;
			temp = temp.next;
		}
		count++;
		return count;
	}

	//printSLL
	
	void printSCLL() {

		if(head == null) {

			System.out.println("Empty linkedlist. ");
			return;
		}else {

			Node temp = head;

			while(temp.next != head) {
					
				System.out.print("| "+temp.data+" |->");
				
				temp = temp.next;
			}
			System.out.println("| "+temp.data+" |");
		}
	}
}

class Client {

	public static void main(String[] args) {	

		LinkedList ll = new LinkedList();
		Scanner sc = new Scanner(System.in);

		char choice;

		do {
			
			System.out.println("Choose one of the following : ");

			System.out.println("1.addFirst");
			System.out.println("2.addLast");
			System.out.println("3.addAtPos");
			System.out.println("4.deleteFirst");
			System.out.println("5.deleteLast");
			System.out.println("6.deleteAtPos");
			System.out.println("7.count Node");
			System.out.println("8.printSLL");


			System.out.println("Enter choice : ");
			int num = sc.nextInt();

			switch(num) {

				case 1 : {

						System.out.println("Enter data : ");
						int data = sc.nextInt();
						
						ll.addFirst(data);
					}
					break;

				case 2 : {

						System.out.println("Enter data : ");
						int data = sc.nextInt();
						
						ll.addLast(data);
					}
					break;

				case 3 : {

						 System.out.println("Enter position : ");
						 int pos = sc.nextInt();
						 System.out.println("Enter data : ");
						 int data = sc.nextInt();

						 ll.addAtPos(pos, data);
					}
					break;

				case 4 : 

					ll.deleteFirst();
					break;

				case 5 :
					ll.deleteLast();
					break;

				case 6 : {

						 System.out.println("Enter position : ");
						 int pos = sc.nextInt();

						 ll.deleteAtPos(pos);
					}
					break;

				case 7 : {

						System.out.println(ll.countNode());
					}
					break;

				case 8 : 
					ll.printSCLL();
					break;

				default :

					System.out.println("Wrong Input ....! ");
			}

			System.out.println("Do You Want To Continue [y/Y] otherwise [n/N] ");
			choice = sc.next().charAt(0);

		}while(choice == 'Y' || choice == 'y');

	}
}
