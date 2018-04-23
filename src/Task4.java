
public class Task4 {
	public static void main(String[] args) {
		int input = 5;
		for (int x = 1; x <= input; x = x+1) {
			for (int y = 0; y <= input-1; y = y+1) {
				if(y>=x) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}			
			for (int z = 1; z <= input-1; z = z+1) {	
				if(z>input-x-1) {
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
