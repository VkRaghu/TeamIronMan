package queue;

public class CircularArrayQ {
	
	public static void main(String[] args) {
		Queue ob = new Queue(10,10);
		ob.enQueue(10);
		ob.enQueue(20);
		ob.enQueue(30);
		ob.enQueue(40);
		
		
		ob.deQueue();
	}
	
}


class Queue{
	public static int front,rear,size;
	public static int arr[];
	
	Queue(int size,int x){
		this.front = -1;
		this.rear = -1;
		this.size = x;
		arr = new int[size];
	}
	
	public boolean isEmpty() {
		if(front == -1) return true;
		return false;
	}
	
	public boolean isFull() {
		if(front ==0 && rear == size-1) return true;
		else if(front == rear+1) return true;
		return false;
	}
	
	public void enQueue(int element) {
		if(isFull()) {
			System.out.println("Queue is full");;
		}
		else
		{
			if(front == -1) front = 0;
			rear = (rear+1)%size;
			arr[rear] = element;
		}
	}
	
	public void deQueue() {
		int element;
		if(isEmpty()) {
			System.out.println("");;
		}
		else
		{
			element = arr[front];
			if(front == rear ) {
				front = -1;
				rear = -1;
			}
			else {
				front = (front+1)%size;
			}
			System.out.println(element);
		}
	}
		
}
