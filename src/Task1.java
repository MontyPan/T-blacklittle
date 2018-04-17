
public class Task1 {
	public static void main(String[] args) {
		int input = 4;
		System.out.println("====我是分隔線====");
		for (int x = 1; x <= input; x = x+1) {
			for (int y = 1; y <= input; y = y+1) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.print("====我是分隔線====");
	}
}
