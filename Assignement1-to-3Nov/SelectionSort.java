package sorting;

public class SelectionSort {
	
	public static void main(String[] args) {
		int []a = {10,5,4,17,12};
		SelectionSort ob = new SelectionSort();
		ob.selection(a);
		ob.print(a);
	}
	
	void selection(int []a) {
		int n = a.length;
		
		for(int i=0; i<n; i++) {
			int min = i;
			for(int j=i+1; j<n; j++) {
				if(a[min]>a[j]) {
					min = j;
					
					int temp = a[min];
					a[min] = a[i];
					a[i] =   temp;
				}
			}
		}
	}
	
	void print(int []a) {
		int n = a.length;
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
