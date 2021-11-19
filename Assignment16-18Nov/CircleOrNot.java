package linkedList;

public class CircleOrNot {
	
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
		node6.next = node1;
		
		Node head = node1;
		print(head);
		
		System.out.println(iscircle(head));
		
	}
	public static void  print(Node head) {
		Node ptr = head;
		while(ptr.next!=head) {
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
		System.out.println(ptr.data);
	}
	public static boolean iscircle(Node head) {
//		boolean flag = false;
		
		Node slow = head;
		Node fast = head;
		while(fast!= null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(fast==slow) {
				return true;
			}
		}
		return false;
	}
	

}
