package tree;

import java.util.Scanner;

public class PathSumSearch {
	
	static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Node5 root = createTree();
		
		int sum = 9;
		searchInPath(root,sum);
	}
	public static Node5 createTree() {
		Node5 root = null;
		System.out.println("Enter data for root : ");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		root = new Node5(data);
		
		System.out.println(" Enter left for "+ data);
		root.left = createTree();
		
		System.out.println(" Enter right for "+ data);
		root.right = createTree();
		
		
		return root;
	}
    public static boolean searchInPath(Node5 root, int sum) {
		
    	if(root==null)
		{
			return false;
		}
		if(root.left==null && root.right==null && sum-root.data==0)
		{
			return true;
		}
		return searchInPath(root.left, sum-root.data) || searchInPath(root.right, sum-root.data);
		
	}

}
class Node5{
	
	int data;
	Node5 left,right;
	Node5(int data){
		this.data=data;
	}
	
}
