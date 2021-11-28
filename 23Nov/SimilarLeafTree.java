package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SimilarLeafTree {
	
	static Scanner sc = null;
	 static List<Integer> ls1 = new ArrayList<>();
	 static List<Integer> ls2 = new ArrayList<>();
	 
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Node6 root = createTree();
		Node6 root1 = createTree();
		
		leafNode1(root);
		leafNode1(root1);
		
		if(ls1.equals(ls2)) {
			System.out.println("True");
		}
		else System.out.println("False");
		
		
	}
	public static Node6 createTree() {
		Node6 root = null;
		System.out.println("Enter data for root : ");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		root = new Node6(data);
		
		System.out.println(" Enter left for "+ data);
		root.left = createTree();
		
		System.out.println(" Enter right for "+ data);
		root.right = createTree();
		
		
		return root;
	}
    public static void leafNode1(Node6 root) {
    	if(root==null)return;
		if(root.left==null && root.right==null)
		{
			ls1.add(root.data);
		}
		leafNode1(root.left);
		leafNode1(root.right);
		
	}
    public static void leafNode2(Node6 root1) {
    	if(root1==null)return;
		if(root1.left==null && root1.right==null)
		{
			ls2.add(root1.data);
		}
		leafNode2(root1.left);
		leafNode2(root1.right);
		
	}

}
class Node6{
	
	int data;
	Node6 left,right;
	Node6(int data){
		this.data=data;
	}
	
}
