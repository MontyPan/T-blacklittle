
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
		System.out.println("======== 我是分隔線 =========");
	}
}
//.gitignore 是一個檔案，紀錄著被  git 忽略的檔案清單。
//.gitignore 存在的目的為減少檔案版本控制時的雜亂程度，將在執行 project 時產生暫存檔案或快取檔案自動忽略。
//若無將這些檔案加入 gitignore 清單內，則這些檔案則會被 git 視為 untracked file，當執行 git add　則會被加入到 local repo。