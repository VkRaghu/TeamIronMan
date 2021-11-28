package tree;

import java.util.Scanner;

public class RightNode {
	
	static Scanner sc = null;
	static int level=0;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Node3 root = createTree();
		int currentLevel = 0;
		rightNodes(root, currentLevel);
		
	}
	public static Node3 createTree() {
		Node3 root = null;
		System.out.println("Enter data for root : ");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		root = new Node3(data);
		
		System.out.println(" Enter left for "+ data);
		root.left = createTree();
		
		System.out.println(" Enter right for "+ data);
		root.right = createTree();
		
		
		return root;
	}
    private static void rightNodes(Node3 root, int currentLevel) {
		
		if(root==null)return;
		
		if(currentLevel>=level)
		{
			System.out.println(root.data);
			level++;
		}
		rightNodes(root.right, currentLevel+1);
		rightNodes(root.left, currentLevel+1);
		
	}

}
class Node3{
	
	int data;
	Node3 left,right;
	Node3(int data){
		this.data=data;
	}
	
}

