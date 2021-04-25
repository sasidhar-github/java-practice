package com.leetcode.trees;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfBT {
	
	Node root;
	
	class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data= data;
			left=right=null;
		}
	}
	public int maxDepth(Node root) {
		
		if(root != null) {
			int lh = maxDepth(root.left);
			int rh = maxDepth(root.right);
			if(lh>rh) {
				return lh+1;
			}else {
		        return rh+1;
			}
		} else {
			return 0;
		}
	}
	
	public int depthQueue(Node root) {
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int height =0;
		while(true) {
			int nodeCount = q.size();
			if(nodeCount==0) {
				return height;
			}
			height++;
			while(nodeCount >0) {
				Node node = q.peek();
				q.remove();
				if(node.left != null) {
					q.add(node.left);
				}
				if(node.right!= null) {
					q.add(node.right);
				}
				nodeCount--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeightOfBT tree = new HeightOfBT();
		 tree.root = tree.new Node(1);
	        tree.root.left = tree.new Node(2);
	        tree.root.right = tree.new Node(3);
	        tree.root.left.left = tree.new Node(4);
	        tree.root.left.right = tree.new Node(5);  
	        tree.root.right.left = tree.new Node(6);
	        tree.root.right.right = tree.new Node(7);
	        tree.root.right.right.right = tree.new Node(8);
	        System.out.println("Height of tree is : " +
	                                      tree.maxDepth(tree.root));
	}
}
