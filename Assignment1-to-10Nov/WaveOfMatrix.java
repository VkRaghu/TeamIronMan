package twoDarray;

public class WaveOfMatrix {
	
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		int top = 0, botm = arr.length-1;
		int upper = 0;
		int dir = 0;
		
		while(upper<arr.length) {
			if(dir==0) {
				for(int i=top; i<=botm; i++) {
					System.out.print(arr[i][upper]+" ");
				}
				upper++;
			}else if(dir==1) {
				for(int i=botm; i>=top; i--) {
					System.out.print(arr[i][upper]+" ");
				}
				upper++;
			}else if(dir==2) {
				for(int i=top; i<=botm; i++) {
					System.out.print(arr[i][upper]+" ");
				}
				upper++;
			}else if(dir==3) {
				for(int i=botm; i>=top; i--) {
					System.out.print(arr[i][upper]+" ");
				}
				upper++;
			}
			dir = (dir+1)%4;
		}
	}

}
