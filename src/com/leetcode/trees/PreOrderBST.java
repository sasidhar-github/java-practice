package com.leetcode.trees;

import java.util.Vector;

public class PreOrderBST {
	Node root;

	void storeBSTNodes(Node root, Vector<Node> vec) {
		if (root == null) {
			return;
		}
		storeBSTNodes(root.left, vec);
		vec.add(root);
		storeBSTNodes(root.right, vec);
	}

	Node buildBinaryTree(Vector<Node> node, int start, int end) {
		Node bst = null;

		if (start > end) {
			return null;
		}
		int mid = (start + end) / 2;
		bst = node.get(mid);
		bst.left = buildBinaryTree(node, start, mid - 1);
		bst.right = buildBinaryTree(node, mid+1, end);

		return bst;
	}

	Node buildTree(Node root) {
		Vector<Node> vec = new Vector<>();
		storeBSTNodes(root, vec);
		return buildBinaryTree(vec, 0, vec.size() - 1);
	}

	void preOrder(Node node) {
		if(node == null) {
			return;
		}
		System.out.println(node.val);
		preOrder(node.left);
		preOrder(node.right);
	}

	public static void main(String[] args) {
		/*
		 * Constructed skewed binary tree is 10 / 8 / 7 / 6 / 5
		 */
		PreOrderBST tree = new PreOrderBST();
		tree.root = new Node(10);
		tree.root.left = new Node(8);
		tree.root.left.left = new Node(7);
		tree.root.left.left.left = new Node(6);
		tree.root.left.left.left.left = new Node(5);

		tree.root = tree.buildTree(tree.root);
		System.out.println("Preorder traversal of balanced BST is :");
		tree.preOrder(tree.root);
	}

}
