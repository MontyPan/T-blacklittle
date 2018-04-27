
public class Task3 {
	public static void main(String[] args) {
		int input = 5;
		System.out.println("======== 我是分隔線 =========");
		for (int x = 0; x < 2*input-1; x = x+1) {
			for (int y = 0; y < input; y = y+1) {
				if(y<=x & y>x-input) {
					System.out.print("*");
				}
			}
				
			System.out.println();
		}
		System.out.print("======== 我是分隔線 =========");
	}
}