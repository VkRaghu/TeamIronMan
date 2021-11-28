package bst;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RngeSumOfBst {
	
	static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Node4 root = createTree();
		
		int l = 4;
		int h = 10;
		rangeSum(root,l,h);
		
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
     public static int rangeSum(Node4 root,int l, int h) {
    	 int sum = 0;
 		Queue<Node4> q = new LinkedList<>();
 		q.add(root);
 		while(!q.isEmpty()) {
 			Node4 temp = q.poll();
 			if(temp.data>=l && temp.data<=h){
 				sum+=temp.data;
 			}
 			if(null != temp.left && l<temp.data) {
 				q.add(temp.left);
 			}
 			if(null != temp.right && h>temp.data) {
 				q.add(temp.right);
 			}
 		}
 		return sum;
		
	}
	
    
}
class Node4{
	
	int data;
	Node4 left,right;
	Node4(int data){
		this.data=data;
	}
	
}

