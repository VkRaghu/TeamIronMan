package linkedList;

public class ReverseList {
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public static void main(String[] args) {
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(40);
		Node node5 = new Node(50);
		Node node6 = new Node(60);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		
		Node head = node1;
		print(head);
		System.out.println();
		System.out.println("------------------------------");
		head = revers(head);
		print(head);
		
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
	public static void  print(Node head) {
		Node ptr = head;
		while(ptr!=null) {
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
	}

}
