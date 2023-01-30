package com.bridgelabz.datastructure;

public class BinarySearchTree {

	/*
	 * Class containing left and right child of current node and key value
	 */
	class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;

		}
	}

	Node root; // Root of BST

	public BinarySearchTree() {
		root = null;
	}

	// This method mainly calls insertRec()
	public void insert(int data) {
		root = insertRec(root, data);
	}

	/*
	 * A recursive function to insert a new key in BST
	 */
	Node insertRec(Node root, int data) {

		/*
		 * If the tree is empty, return a new node
		 */
		if (root == null) {
			root = new Node(data);
			return root;
		}
		/*
		 * otherwise, recur down the tree
		 */
		if (data < root.data)
			root.left = insertRec(root.left, data);
		else
			root.right = insertRec(root.right, data);
		return root;

	}

	public void inOrder() {
		inOrderRec(root);

	}

	public void inOrderRec(Node root) {
		if (root == null)
			return;
		inOrderRec(root.left);
		System.out.println(root.data + " ");
		inOrderRec(root.right);
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(56);
		tree.inOrder();
		System.out.println();
		tree.insert(30);
		tree.inOrder();
		System.out.println();
		tree.insert(70);
		tree.inOrder();
	}

}
