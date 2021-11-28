package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AvgOfLevel {
	
	
	static Scanner sc = null;
	
	static List<Double> ls = new ArrayList<>();
	
	static int count = 0;
	static double sum = 0;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Node7 root = createTree();
		int height = height(root);
		
		
		for(int lev=0; lev<height; lev++) {
			
			kthLevel(root,  lev);
			double avg = sum/count;
			ls.add(avg);
			sum = 0;
			count = 0;
		}
		
		System.out.println(ls);
		
	}
	public static Node7 createTree() {
		Node7 root = null;
		System.out.println("Enter data for root : ");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		root = new Node7(data);
		
		System.out.println(" Enter left for "+ data);
		root.left = createTree();
		
		System.out.println(" Enter right for "+ data);
		root.right = createTree();
		
		
		return root;
	}
    public static void kthLevel(Node7 root, int k) {
		
		if(root==null)return;
		if(k==0)
		{
			sum = sum + root.data;
			count++;
		}
		kthLevel(root.left, k-1);
		kthLevel(root.right, k-1);
		
	}
    static int height(Node7 root) {
		if(root == null) return 0;
		
		int lh = height(root.left);
		int rh = height(root.right);
		
		if(lh>rh) {
			return lh+1;
		}else
			return rh+1;
	}
    

}
class Node7{
	
	int data;
	Node7 left,right;
	Node7(int data){
		this.data=data;
	}
	

}
