package stack;

public class StackOperation {
	
	public static void main(String[] args) {
		stack obj =new stack();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		obj.push(60);
		obj.push(70);
		obj.push(80);
		System.out.println(obj.peek());
		obj.pop();
		System.out.println(obj.peek());
	}

}
class stack{
	
	int arr[] = new int[10];
	int size =0;
	void push(int data) {
		if(size<arr.length) {
			arr[size] = data;
			size++;
		}
		else {
			System.out.println("Stack is Overflow");
		}
	}
	void pop() {
		
		if(size==0) {
			System.out.println("Stack is underflow");
		}
		else {
			System.out.println(arr[size]);
			size--;
		}
	}
	int peek() {
		
		if(size==0) {
			return -1;
		}
		else {
			return arr[size-1];
		}
	}
}
