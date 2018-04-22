
public class Task2 {
	public static void main(String[] args) {
		int input = 5;
		System.out.println("======== 我是分隔線 =========");
		for (int x = 1; x <= input; x = x+1) {
			for (int y = 1; y <= x; y = y+1) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.print("======== 我是分隔線 =========");
	}
}
