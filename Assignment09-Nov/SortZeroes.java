package sorting;

public class SortZeroes {
	
	public static void main(String[] args) {
        int[] a = {1,0,1,0,1,0,1,1,1,1,1};
		
		int i=0,j=a.length-1;
		
		while(i<=j) {
			if(a[i]==1) {
				int tmp =a[i];
				a[i]= a[j];
				a[j] = tmp;
				--j;
			}
			else i++;
		}
		
		for (int i1 = 0; i1 < a.length; i1++)
		    System.out.print(a[i1] + " ");
	}

}
