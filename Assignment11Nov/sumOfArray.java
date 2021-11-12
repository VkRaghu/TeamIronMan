package recursion;

public class sumOfArray {
	
	public static void main(String[] args) {
		int a[] = {1,2,5,5,10};
		int total = 0;
		int n = a.length-1;
		sum(a,n,total);
	}
	
	static void sum(int []a, int n, int total) {
		if(n<0) {
			System.out.println(total);
			return;
		}
		 total = total + a[n];
		sum(a,n-1,total);
		
	}

}
