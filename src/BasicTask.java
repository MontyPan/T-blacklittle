
public class BasicTask {
	public static void task1(int input) {
		for (int x = 0; x <= input; x = x+1) {
			for (int y = 0; y <= input; y = y+1) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void task2(int input) {
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
