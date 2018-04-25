
public class Task4 {
	public static void main(String[] args) {
		int input = 5;
		for (int x = 0; x <= input-1; x = x+1) {
			for (int y = 0; y <= 2*input-2; y = y+1) {
				if(y<=x | y>2*input-x-3) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}			
			System.out.println();
		}
		System.out.print("======== 我是分隔線 =========");
	}
}
