package binarySearch;

public class SearchInRotatedArra {
	
	public static void main(String[] args) {
//		int a[] = {4,5,6,7,0,1,2,3};
//		int a[] = {5,1,4};
		int []a = {3,1};
		int target = 1;
		System.out.println(search(a,target));
	}
	
	static int search(int a[], int target) {
		int l = 0, h = a.length-1;
		
		while(l<=h) {
			int mid = (l+h)/2;
			if(a[mid]==target) {
				return mid;
			}
			else if(a[mid]>=a[l]) {
				if(target>=a[l] && target<a[mid]) {
					h = mid - 1;
				}
				else l =mid + 1;
			}
			else {
				if(target<=a[h] && target>a[mid]) {
					l = mid + 1;
				}
				else h = mid - 1;
			}
		}
		return -1;
	}

}
