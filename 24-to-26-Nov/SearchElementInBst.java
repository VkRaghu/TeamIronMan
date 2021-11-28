package bst;

import java.util.Scanner;


public class SearchElementInBst {
	
	static Scanner sc = null;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Node3 root = createTree();
		int target = 10;
		search(root, target);
		
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
    public static boolean search(Node3 root, int target) {
    	if(null == root) return false;
		if(root.data == target) return true;
		else if(root.data > target) {
			return search(root.left, target);
		}
		else return search(root.right, target);
	}

}
class Node3{
	
	int data;
	Node3 left,right;
	Node3(int data){
		this.data=data;
	}
	
}

