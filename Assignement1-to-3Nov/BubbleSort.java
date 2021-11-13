package sorting;

public class BubbleSort {
	
	void bubble(int []a) {
		int n = a.length;
		boolean flag = false;
		for(int i=0; i<n-1; i++) {
			flag = false;
			for(int j=0; j<n-i-1; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
					flag = true;
				}
			}
			if(flag==false) break;
		}
	}
	
	void print(int []a) {
		int n = a.length;
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int []a = {10,5,4,15,12};
		BubbleSort b = new BubbleSort();
		b.bubble(a);
		b.print(a);
	}

}
