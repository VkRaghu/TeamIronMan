package tree;

import java.util.Scanner;

public class BinaryTreeAllOperations {
	static Scanner sc = null;
	static int sum = 0;
	static int count = 0;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Node root = createTree();
		
		inOrder(root);
		
		System.out.println();
		
		preOrder(root);
		System.out.println();
		
		postOrder(root);
		System.out.println();
		
		System.out.println(height(root));
		
		System.out.println();
		leafNode(root);
		
		System.out.println();
		int totalsum = sumOfNodes( root);
		System.out.println(totalsum);
		
		System.out.println();
		int NumberOfNodes = noOfNOdes( root);
		System.out.println(NumberOfNodes);
	}
	
	public static Node createTree() {
		Node root = null;
		System.out.println("Enter data for root : ");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		root = new Node(data);
		
		System.out.println(" Enter left for "+ data);
		root.left = createTree();
		
		System.out.println(" Enter right for "+ data);
		root.right = createTree();
		
		
		return root;
	}
	static int height(Node root) {
		if(root == null) return 0;
		
		int lh = height(root.left);
		int rh = height(root.right);
		
		if(lh>rh) {
			return lh+1;
		}else
			return rh+1;
	}
	public static void leafNode(Node root) {
		if(root==null)
		{
			return;
		}
		if(root.left== null && root.right==null) {
			System.out.print(root.data+" ");
		}
		leafNode(root.left);
		leafNode(root.right);
	}
    public static int sumOfNodes(Node root) {
		
		if(root==null)
		{
			return 0;
		}
		sum=sum+root.data;
		sumOfNodes(root.left);
		sumOfNodes(root.right);
		return sum;
		
	}
    public static int noOfNOdes(Node root) {
		
		if(root==null)
		{
			return 0;
		}
		count ++;
		noOfNOdes(root.left);
		noOfNOdes(root.right);
		return count;
	}
	
	static void inOrder(Node root) {
		if(root == null) return ;
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		
		inOrder(root.right);
	
	}
	
	static void preOrder(Node root) {
		if(root == null) return ;
		
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	static void postOrder(Node root) {
		if(root == null) return ;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}


}
class Node{
	
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
	}
	
}
