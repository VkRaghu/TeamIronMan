package mergeSort;

public class MergeSortAlgo {
	
	public static void main(String[] args) {
		int arr[] = { 4,6,2,5,7,9,1,3};
		  
       divide(arr, 0, arr.length - 1);
        
        for(Integer val: arr) {
        	System.out.print(val +" ");
        }
  
	}
	
	static void divide(int []arr, int start,int last) {
		if(start<last) {
			int mid = start+(last-start)/2;
			
			divide(arr,start,mid);
			divide(arr,mid+1,last);
			
			merge(arr,start,mid,last);
		}
	}
	
	static void merge(int []arr,int start,int mid,int last) {
		int len1 = mid-start+1;
		int len2 = last-mid;
		
		int temp1[] = new int[len1];
		int temp2[] = new int[len2];
		
		for(int i=0; i<len1; i++) {
			temp1[i] = arr[start+i];
		}
		for(int i=0; i<len2; i++) {
			temp2[i] = arr[mid+i+1];
		}
		int i = 0, j = 0;
		int k = start;
		while(i<len1 && j<len2) {
			
			if(temp1[i]<=temp2[j]) {
				arr[k] = temp1[i];
				i++;
			}
			else {
				arr[k] = temp2[j];
				j++;
			}
			k++;
		}
		while(i<len1) {
			arr[k] = temp1[i];
			k++;
			i++;
		}
		while(j<len2) {
			arr[k] = temp2[j];
			j++;
			k++;
		}
		
	}

}
