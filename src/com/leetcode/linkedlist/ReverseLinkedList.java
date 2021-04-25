package com.leetcode.linkedlist;

public class ReverseLinkedList {

	// TODO Auto-generated method stub
	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);

	}

	/* Function to reverse the linked list */
	Node reverse(Node head) {
		Node newNode = null;
		Node next = null;
		while(head != null) {
             next = head.next;
             head.next = newNode;
             newNode = head;
             head = next;
		}
		return newNode;
	}

	// prints content of double linked list
	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
}