package com.leetcode.linkedlist;

public class DeleteNthNodeFromList {

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
		DeleteNthNodeFromList list = new DeleteNthNodeFromList();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		list.printList(head);
		head = list.deleteNthNode(head.next,2);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);

	}

	Node deleteNthNode(Node node,int n) {
		Node dummy = new Node(0);
	    dummy.next = head;
	    int length  = 0;
	    Node first = head;
	    while (first != null) {
	        length++;
	        first = first.next;
	    }
	    length -= n;
	    first = dummy;
	    while (length > 0) {
	        length--;
	        first = first.next;
	    }
	    first = first.next;
	    first.next = first.next.next;
	    return dummy.next;
	}
	
	public Node removeNthFromEnd(Node head, int n) {
	    Node dummy = new Node(0);
	    dummy.next = head;
	    Node first = dummy;
	    Node second = dummy;
	    // Advances first pointer so that the gap between first and second is n nodes apart
	    for (int i = 1; i <= n + 1; i++) {
	        first = first.next;
	    }
	    // Move first to the end, maintaining the gap
	    while (first != null) {
	        first = first.next;
	        second = second.next;
	    }
	    second.next = second.next.next;
	    return dummy.next;
	}

	// prints content of double linked list
	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}

	}
}