package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrderTraversal {
	
	
	static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Node4 root = createTree();
		printlevelwise(root);
		
	}
	public static Node4 createTree() {
		Node4 root = null;
		System.out.println("Enter data for root : ");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		root = new Node4(data);
		
		System.out.println(" Enter left for "+ data);
		root.left = createTree();
		
		System.out.println(" Enter right for "+ data);
		root.right = createTree();
		
		
		return root;
	}
     public static void printlevelwise(Node4 root) {
		
		Queue<Node4> lev=new LinkedList<Node4>();
		lev.add(root);
		while(lev.isEmpty()==false)
		{
			if(root==null)return;
			Node4 curr=lev.poll();
			System.out.print(curr.data+" ");
			
			if(curr.left!=null)
			{
				lev.add(curr.left);
			}
			if(curr.right!=null)
			{
				lev.add(curr.right);
			}
		}
		
	}
	
    
}
class Node4{
	
	int data;
	Node4 left,right;
	Node4(int data){
		this.data=data;
	}
	
}