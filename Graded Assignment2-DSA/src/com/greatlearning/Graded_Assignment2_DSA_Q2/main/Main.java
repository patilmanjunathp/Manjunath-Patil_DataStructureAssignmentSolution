package com.greatlearning.Graded_Assignment2_DSA_Q2.main;
import java.io.*;

public class Main
{
	 public static Node node;
	 static Node tempNode = null;
	 static Node headNode = null;
	 
	 
	static class Node
	 {
	 	
		int key;
	 	Node left;
	 	Node right;
	 	
	 	
	 	Node(int data)
	 	{
	 		key = data;
	 	   left = null;
	 	  right = null;
	 	}
	
	 }

	
	static void binarySearchTreeToSkewed(Node root)
     {
	
		// Base Case
		if(root == null)
		{
			return;
		}
	
		binarySearchTreeToSkewed(root.left);
		
		Node rightNode = root.right;
		
	   if(headNode == null)
		{
			headNode = root;
			root.left = null;
			tempNode = root;
		}
		
		else
		{
			tempNode.right = root;
			root.left = null;
			tempNode = root;
		}
	
	   binarySearchTreeToSkewed(rightNode);
		
	}

	
	static void traverseSkewedTree(Node root)
	{
		
		if(root == null)
		{
			return;
		}
		
		System.out.print(root.key + " ");
		traverseSkewedTree(root.right);	
	
	}

	// Driver Code
	public static void main (String[] args)
	{
	
		Main tree = new Main();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left= new Node(55);
		
		binarySearchTreeToSkewed(node);
		traverseSkewedTree(headNode);
	}

}



