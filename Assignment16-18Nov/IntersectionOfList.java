package linkedList;

public class IntersectionOfList {
	
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
		System.out.println("----------------------");
		Node n1 = new Node(10);
		Node n2 = new Node(30);
		Node n3 = new Node(35);
		
		
		n1.next = n2;
		n2.next = n3;
		n3.next = node4;
		
		Node head2 = n1;
		print(head2);
		System.out.println();
		System.out.println("Intersection point is : "+intersection(head,head2));
	}
	public static int intersection(Node head, Node head2) {
		Node c1 = head;
		Node c2 = head2;
		while(c1!=c2) {
			c1=c1.next;
			c2=c2.next;
		}
		return c1.data;
	}
		
	public static void  print(Node head) {
		Node ptr = head;
		while(ptr!=null) {
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
	}
}
