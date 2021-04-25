package com.leetcode.linkedlist;

public class PalindromeLinkedList {

	// TODO Auto-generated method stub
	static Node head;

	static class Node {

		int val;
		Node next;

		Node(int d) {
			val = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		PalindromeLinkedList list = new PalindromeLinkedList();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(2);
		list.head.next.next.next = new Node(1);

		System.out.println("Given Linked list");
		list.printList(head);
		System.out.println(list.isPalindrome1(head));

	}

	public boolean isPalindrome1(Node head) {

		Node first = head;
		Node second = head;

		while (first.next != null && first.next.next != null) {
			first = first.next.next;
			second = second.next;
		}
		Node fir = second.next;
		//second.next = null;
		Node newNode = null;
		while (fir != null) {
			Node next = fir.next;
			fir.next = newNode;
			newNode = fir;
			fir = next;
		}
		while (newNode != null) {
			if (newNode.val != head.val) {
				return false;
			}
			newNode = newNode.next;
			head = head.next;
		}
		return true;
	}

	public boolean isPalindrome(Node head) {
		if (head == null || head.next == null)
			return true;
		// find list center
		Node fast = head;
		Node slow = head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		Node secondHead = slow.next;
		slow.next = null;
		// reverse second part of the list
		Node p1 = secondHead;
		Node p2 = p1.next;
		while (p1 != null && p2 != null) {
			Node temp = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = temp;
		}
		secondHead.next = null;
		// compare two sublists now
		Node p = (p2 == null ? p1 : p2);
		Node q = head;
		while (p != null) {
			if (p.val != q.val)
				return false;
			p = p.next;
			q = q.next;
		}
		return true;
	}

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}
}