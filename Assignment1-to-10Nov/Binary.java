package binarySearch;

public class Binary {
	
	public static int binary_search(int search, int []a) {
		int start = 0;
		int end = a.length-1;
		
		int mid = (start + end)/2;
		while(start<=end) {
			
			if(a[mid]==search) {
				return mid;
			}
			else if(a[mid]<search) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
			 mid = (start + end)/2;
			
			if(start>end) {
				return -1;
			}
		
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		int []a = {2,4,6,8,9,11};
		int search = 12;
		System.out.println(binary_search(search,a));
	}

}
