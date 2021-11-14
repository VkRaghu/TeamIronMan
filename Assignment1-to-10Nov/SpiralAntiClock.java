package twoDarray;

public class SpiralAntiClock {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		int top = 0, botm = arr.length-1;
		int left = 0, right = arr.length-1;
		int dir = 0;
		
		while(top<=botm && left<=right) {
			if(dir==0) {
				for(int i=top; i<=botm; i++) {
					System.out.print(arr[i][left]+" ");
				}
				left++;
			}
			else if(dir==1) {
				for(int i=left; i<=right; i++) {
					System.out.print(arr[botm][i]+" ");
				}
				botm--;
			}else if(dir==2) {
				for(int i=botm; i>=top; i--) {
					System.out.print(arr[i][right]+" ");
				}
				right--;
			}else if(dir==3) {
				for(int i=right; i>=left; i--) {
					System.out.print(arr[top][i]+" ");
				}
				top++;
			}
			dir = (dir+1)%4;
		}
	}

}
