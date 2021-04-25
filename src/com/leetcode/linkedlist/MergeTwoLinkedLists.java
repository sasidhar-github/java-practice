package com.leetcode.linkedlist;

public class MergeTwoLinkedLists {

	// TODO Auto-generated method stub
	Node head;

	class Node {
		int val;
		Node next;
		Node(int d) {
			val = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		MergeTwoLinkedLists list = new MergeTwoLinkedLists();
		list.head = list.new Node(1);
		list.head.next = list.new Node(2);
		list.head.next.next = list.new Node(5);
		list.head.next.next.next = list.new Node(4);
		
		MergeTwoLinkedLists secondList = new MergeTwoLinkedLists();
		secondList.head = list.new Node(9);
		secondList.head.next = list.new Node(12);
		secondList.head.next.next = list.new Node(3);
		secondList.head.next.next.next = list.new Node(6);

		System.out.println("Given Linked list");
		System.out.println(list.mergeLinkedList(list.head,secondList.head));
		list.printList(list.head);
	}


	public Node mergeLinkedList(Node first,Node second) {
		if (first == null && second == null) {
			return null;
	     } 
		if(first == null) {
			return second;
		}
		while(first.next != null ) {
			first = first.next;
		}
		first.next = second;
		
		return first;
	}
	void printList(Node node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}
}