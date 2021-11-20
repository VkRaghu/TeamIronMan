package stack;

import java.util.Stack;

public class FindMinAndMax {
	
	public static void main(String[] args) {
		
		int arr[] = {4,3,2,1,5};
		
		System.out.println(min(arr));
		System.out.println(max(arr));
	}
	
	public static int min(int arr[]) {
        Stack<Node> st = new Stack<>();
		
		Node n;
		for(int i=0; i<arr.length; i++) {
			if(st.isEmpty()) {
				n=new Node();
				n.key = arr[i];
				n.min = arr[i];
				st.push(n);
			}
			else {
				n=new Node();
				n.key = arr[i];
				n.min = arr[i];
				if(st.peek().key<arr[i]) {
					n.min = st.peek().key;
					st.push(n);
				}
				else {
					n.min=arr[i];
					st.push(n);
				}
			}
		}
		return st.peek().min;
	}
	
	public static int max(int arr[]) {
        Stack<Node> st = new Stack<>();
		
		Node n;
		for(int i=0; i<arr.length; i++) {
			if(st.isEmpty()) {
				n=new Node();
				n.key = arr[i];
				n.min = arr[i];
				st.push(n);
			}
			else {
				n=new Node();
				n.key = arr[i];
				n.min = arr[i];
				if(st.peek().key>arr[i]) {
					n.min = st.peek().key;
					st.push(n);
				}
				else {
					n.min=arr[i];
					st.push(n);
				}
			}
		}
		return st.peek().min;
	}

}
class Node{
	int min,key;
}
