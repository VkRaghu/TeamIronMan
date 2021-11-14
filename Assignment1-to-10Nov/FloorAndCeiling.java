package binarySearch;

public class FloorAndCeiling {
	
	static int ceiling(int []a, int target) {
		int low = 0, high = a.length-1;
		 
		while(low<=high) {
//			int []a = {2,3,5,6,9,11,13,15};	
			int mid = low+(high-low)/2;
			if(target<a[mid]) {
				high = mid-1;
			}
			else if(a[mid]<target) {
				low = mid + 1;
			}
		}
		return a[low];
	}
	
	static int floor(int[] a, int target ) {
		int start = 0, end = a.length-1;
		
		while(start<=end) {
			int mi = start+(end-start)/2;
			
			if(a[mi]>target) {
				end = mi - 1;
			}
			else if(target>a[mi]) {
				start = mi + 1;
			}
		}
		return a[end];
	}
	
	public static void main(String[] args) {
		int []a = {2,3,5,6,9,11,13,15};	
		int target = 10;
		System.out.println(ceiling(a,target));
		System.out.println(floor(a,target));
	}

}
