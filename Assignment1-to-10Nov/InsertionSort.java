package sorting;

public class InsertionSort {
	
	void insertion(int []a) {
		
		for(int i=1; i<a.length; i++) {
			int temp = a[i];
			int j = i-1;
			while(j>=0 && a[j]>temp) {
				a[j+1] = a[j];
				
				j--;
			}
			a[j+1] = temp;
		}
	}
	
	void print(int []a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int []a = {10,5,4,17,12};
		InsertionSort ob = new InsertionSort();
		ob.insertion(a);
		ob.print(a);
	}

}
