package arrayList;
import java.util.ArrayList;
public class SortArrayList {
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(25);
		arr.add(10);
		arr.add(15);
		arr.add(30);
		arr.add(5);
		for(Integer val : arr) {
			System.out.print(val+" ");
		}
		System.out.println();
		System.out.println("After sorting");
		for(int i=0; i<arr.size(); i++) {
			for(int j=i+1; j<arr.size(); j++) {
				if(arr.get(i)<arr.get(j)) {
					int temp = arr.get(i);
					arr.set(i, arr.get(j)) ;
					arr.set(j, temp);
				}
			}
			
		}
		System.out.println(arr);
	}

}
