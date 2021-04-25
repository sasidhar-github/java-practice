package com.leetcode.trees;

import java.util.ArrayList;

public class BinaryTree {
	Node root;
	static ArrayList<Integer> list = new ArrayList<>();
	ArrayList<Integer> preOrder(Node node) {
		if(node == null) {
			return null;
		}
		list.add(node.val);
		preOrder(node.left);
		preOrder(node.right);
		return list;
	}

	public static void main(String[] args) {
		/*
		 * Constructed skewed binary tree is 10 / 8 / 7 / 6 / 5
		 */
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10);
		tree.root.left = new Node(8);
		tree.root.left.right = new Node(7);
		tree.root.left.right.left = new Node(6);
		tree.root.left.left = new Node(5);

		System.out.println("Preorder traversal of balanced BST is :");
		tree.preOrder(tree.root);
	    list.stream().forEach(val->System.out.println(val));
	}

}
