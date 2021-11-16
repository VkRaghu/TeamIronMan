package quickSort;

public class QuickSort1 {
	
	public static void main(String[] args) {
		int arr[] = { 4,6,2,5,7,9,1,3};
		
		sort(arr,0,arr.length-1);
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	static void sort(int []arr, int l,int h) {
		if(l<h) {
			int pivot = quick(arr,l,h);
			sort(arr,l,pivot-1);
			sort(arr,pivot+1,h);
		}
	}
	
	static int quick(int arr[], int l, int h) {
		int pivot = arr[l];
		int i =l;
		int j = h;
		
		while(i<j) {
			while(arr[i]<pivot) {
				i++;
			}
			while(arr[j]>pivot) {
				j--;
			}
			if(i<j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = pivot;
		pivot = arr[j];
		arr[j] = temp;
		
		return j;
	}

}
