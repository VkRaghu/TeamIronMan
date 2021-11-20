package queue;

public class CircularLLqueue {
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next = null;
		}
	}
	static class Queue {
        Node front, rear;
    }
  
    static void enQ(Queue q, int data)
    {
        Node temp = new Node(data);
        if (q.front == null)
            q.front = temp;
        else
            q.rear.next = temp;
  
        q.rear = temp;
        q.rear.next = q.front;
    }
    
    static int deQ(Queue q)
    {
        if (q.front == null) {
            System.out.printf("Queue is empty");
            return Integer.MIN_VALUE;
        }

        int value; 
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
        }
        else
        {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.next;
            q.rear.next = q.front;
        }
  
        return value;
    }

    static void printQ(Queue q)
    {
        Node temp = q.front;
        System.out.println("Elements in Circular Queue are: ");
        while (temp.next != q.front) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data+" ");
    }
    
    public static void main(String[] args) {
		
    	Queue q = new Queue();
        q.front = q.rear = null;
        
        enQ(q, 10);
        enQ(q, 20);
        enQ(q, 30);
        
        printQ(q);
        
        deQ(q);
        printQ(q);
	}

}
