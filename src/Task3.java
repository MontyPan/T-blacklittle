
public class Task3 {
	public static void main(String[] args) {
		int input = 5;
		System.out.println("======== 我是分隔線 =========");
		for (int x = 1; x <= 2*input-1; x = x+1) {
			if (x > input) {
				for (int y = 1; y <= 2*input-x; y = y+1) {
					System.out.print("*");
				}	
				System.out.println();
			}
			else {
				for (int y = 1; y <= x; y = y+1) {
					System.out.print("*");
				}	
				System.out.println();
			}
		}
		System.out.print("======== 我是分隔線 =========");
	}
}