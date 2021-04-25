package com.leetcode.linkedlist;

public class CycleLinkedList {

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
		CycleLinkedList list = new CycleLinkedList();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);
		System.out.println(hasCycle(head));
	}
	
	static boolean hasCycle(Node head) {
         Node first = head;
         Node second = head;
         while(first != null && first.next != null) {
        	 first = first.next.next;
        	 second = second.next;
        	 if(first == second) {
        		 return true;
        	 }
         }	
		return false;
	}
}