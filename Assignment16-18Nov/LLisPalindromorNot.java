package linkedList;

public class LLisPalindromorNot {
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(2);
		Node node5 = new Node(1);
//		Node node6 = new Node(1);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
//		node5.next = node6;
		
		Node head = node1;
		
		System.out.println(ispalindrome(head));
	}
	public static Node revers(Node head) {
		Node curr = head;
		Node prev = null;
		while(curr!=null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return head=prev;
	}
	public static boolean ispalindrome(Node head) {
		if(head==null) return true;
		Node mid = middle(head);
		Node last = revers(mid);
		Node cur = head;
		while(last!=null) {
			if(last.data!=cur.data) {
				return false;
			}
			last=last.next;
			cur = cur.next;
		}
		return true;
	}
	
	public static Node middle(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	public static void  print(Node head) {
		Node ptr = head;
		while(ptr!=null) {
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
	}

}
