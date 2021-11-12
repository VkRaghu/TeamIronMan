package recursion;

public class RevString {
	
	public static void main(String[] args) {
		String str = "Vikash";
		char ch[] = str.toCharArray();
		int len = ch.length-1;
		RevString ob = new RevString();
		ob.rev(ch, len);
	}
	
	void rev(char ch[], int len) {
		if(len<0) {
			return;
		}
		System.out.print(ch[len]);
		rev(ch,len-1);
	}

}
