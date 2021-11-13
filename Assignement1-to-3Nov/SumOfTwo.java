package binarySearch;

public class SumOfTwo {
	
	public static void main(String[] args) {
		int a[] = {2,3,4,5,7,8};
		int key = 9;
		int []a2 = search(a,key);
		for(int i = 0; i<a2.length; i++) {
			System.out.println(a2[i]+" ");
		}
	}
	
	static int[] search(int []a, int key) {
		int low = 0, high = a.length-1;
		int a1[] = new int[2];
		while(low<high) {
			if(a[low]+a[high]==key) {
				a1[0] = low+1;
				a1[1] = high+1;
				break;
				
			}
			else if(a[low]+a[high]>key) {
				high--;
			}
			else if(a[low]+a[high]<key) {
				low++;
			}
		}
		
		return a1;
	}

}
