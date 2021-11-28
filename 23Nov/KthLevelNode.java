package tree;

import java.util.Scanner;

public class KthLevelNode {
	
	static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Node2 root = createTree();
		int level = 2;
		kthLevel(root,level);
	}
	public static Node2 createTree() {
		Node2 root = null;
		System.out.println("Enter data for root : ");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		root = new Node2(data);
		
		System.out.println(" Enter left for "+ data);
		root.left = createTree();
		
		System.out.println(" Enter right for "+ data);
		root.right = createTree();
		
		
		return root;
	}
    public static void kthLevel(Node2 root, int k) {
		
		if(root==null)return;
		if(k==0)
		{
			System.out.print(root.data+" ");
		}
		kthLevel(root.left, k-1);
		kthLevel(root.right, k-1);
		
	}

}
class Node2{
	
	int data;
	Node2 left,right;
	Node2(int data){
		this.data=data;
	}
	
}

