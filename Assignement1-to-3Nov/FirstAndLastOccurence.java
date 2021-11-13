package binarySearch;

public class FirstAndLastOccurence {
	
	static int first(int[] array, int target) {
		
		int start = 0, end = array.length-1;
		int fi = -1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(array[mid]>target) {
				end = mid - 1;
			}
			else if(array[mid]<target) {
				start = mid + 1;
			}
			else if(array[mid]==target){
				fi = mid;
				end = mid - 1;
			}
			
		}
		
		return fi;
	}
	
	static int last(int[] array, int target) {
		
		int start = 0, end = array.length-1;
		int la = -1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(target>array[mid]) {
				start = mid + 1;
			}
			else if(target<array[mid]) {
				end = mid - 1;
			}
			else {
				la = mid;
				start = mid + 1;
			}
		}
		
		return la;
	}
	
	public static void main(String[] args) {
		int []array = {1,3,3,3,3,3,6,6,6,6,7,7,7,7};
		int target = 3;
		int firstOccurenc = first(array,target);
		int lastOccurenc = last(array,target);
		System.out.println(firstOccurenc);
		System.out.println(lastOccurenc);
		
	}

}
