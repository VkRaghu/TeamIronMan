package binarySearch;

public class PivotOfRotatedArray {
	
	static int pivot(int[] a) {
		int start = 0, end = a.length-1;
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(a[mid]<a[mid-1] && a[mid]<a[mid+1]) {
				return mid;
			}
			else if(a[start]>a[mid]) {
				end = mid - 1;
			}
			else if(a[end]<a[mid]) {
				start = mid + 1;
			}
			
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		int []a = {8,9,10,1,2,3,4,5,6,7};
		System.out.println(pivot(a));
	}

}
