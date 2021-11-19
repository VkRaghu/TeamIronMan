package linkedList;

public class MergeTwoSortedList {
	
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
		
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		System.out.println("List 1-----");
		Node head = node1;
		print(head);
		System.out.println();
		System.out.println("------------------------------");
		Node n1 = new Node(10);
		Node n2 = new Node(30);
		Node n3 = new Node(60);
		
		
		n1.next = n2;
		n2.next = n3;
		
		Node head1 = n1;
		print(head1);
		System.out.println();
		System.out.println("------------------------------");
		Node newHead = merge(head,head1);
		print(newHead);
		
	}
	public static Node merge(Node head,Node head1) {
		if(head==null) return head1;
		if(head1==null) return head;
		
		Node newNode = new Node(-1);
		Node prev = newNode;
		
		Node c1 = head;
		Node c2 = head1;
		while(c1!=null && c2!=null) {
			if(c1.data<=c2.data) {
				prev.next = c1;
				c1 = c1.next;
			}
			else {
				prev.next = c2;
				c2 = c2.next;
			}
			prev =prev.next;
		}
		while(c1!=null) {
			prev.next=c1;
			c1=c1.next;
			prev = prev.next;
		}
		while(c2!=null) {
			prev.next=c2;
			c2=c2.next;
			prev = prev.next;
		}
		return newNode.next;
		
	}
	
	public static void  print(Node head) {
		Node ptr = head;
		while(ptr!=null) {
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
	}

}
