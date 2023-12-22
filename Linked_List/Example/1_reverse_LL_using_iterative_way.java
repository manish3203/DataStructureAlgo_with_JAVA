
/*

   reverse linked list
	
   input : 1->2->3->4
   output : 4->3->2->1


*/


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

	void addNode(int data) {

		Node newNode = new Node(data);

		if(head == null) {

			head = newNode;
		}else {

			Node temp = head;

			while(temp.next != null) {

				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	void printLL() {

		if(head == null) {

			System.out.println("Empty Linked List ");
			return;
		}else {

			Node temp = head;

			while(temp.next != null) {

				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}

	void reverseLL() {

		Node prev = null;
		Node current = head;
		Node forward = null;

		while(current != null) {

			forward = current.next;
			current.next = prev;
			prev = current;
			current = forward;
		}
		head = prev;
	}

}

class Client {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LinkedList ll = new LinkedList();

		System.out.println("How many linked list you have enter here :");
		int count = sc.nextInt();
		
		System.out.println("Enter data : ");
		for(int i=0; i<count; i++) {
			
			int data = sc.nextInt();
			ll.addNode(data);
		}

		System.out.println("LinkedList : ");
		ll.printLL();
		
		ll.reverseLL();

		System.out.println("reverse LinkedList : ");
		ll.printLL();

	}
}

