package com.leetcode.linkedlist;

public class LinkedList {

	Node head;
	int size=0;

	class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}
    public LinkedList() {
        this.size = 0;
        this.head = null;
    }
    
	public void insert(int data) {
		Node node = new Node(data);
		node.next= null;
		if(head == null) {
			head= node;
		}else {
			Node last = head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = node;
		}
        size++;
	}
	
	public int get(int index) {
		if(size ==0 || index <0 || index > size) {
			return -1;
		} else {
			int i =0;
			Node curr = head;
			while(i!=index) {
				curr = curr.next;
				i++;
			}
			return curr.data;
		}
	}
	
	public void addAtHead(int val) {
		Node newNode = new Node(val);
		newNode.next = this.head;
		this.head = newNode;
		size++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		System.out.println(list.size);
		list.insert(2);
		System.out.println(list.size);
	}

}
