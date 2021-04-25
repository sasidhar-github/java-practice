package com.leetcode;

public class MirrorTree {

	Node root;
	class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	Node inOrder(Node node) {
		if(node == null) return null;
		inOrder(node.left);
		System.out.println(node.data);
		inOrder(node.right);
		return null;
	}
	
	public Node mirrorTree(Node node) {
		if(node == null) {
			return node;
		}
		Node left = mirrorTree(node.left);
		Node right = mirrorTree(node.right);
		node.left = right;
		node.right = left;
		return node;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MirrorTree tree = new MirrorTree();
		tree.root = tree.new Node(1);
		tree.root.left = tree.new Node(2);
		tree.root.right = tree.new Node(3);
		tree.root.left.left = tree.new Node(4);
		tree.root.left.right = tree.new Node(5);
		tree.root.right.left = tree.new Node(6);
		tree.root.right.right = tree.new Node(7);
		tree.root.right.right.right = tree.new Node(8);
		System.out.println(tree.inOrder(tree.root));
		System.out.println(tree.mirrorTree(tree.root));
		System.out.println(tree.inOrder(tree.root));
	}
}
