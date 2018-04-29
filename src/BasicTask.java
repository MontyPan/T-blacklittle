
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

	public static void task4(int input) {
		for (int x = 0; x < input; x = x+1) {
		/*把 x<=input-1 寫成 x<input 對讀者而言較直觀，不用再多做一次數學計算。
		 *也可以省下電腦多一層計算的資源。
		 */
			for (int y = 0; y < 2*input-1; y = y+1) {
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
