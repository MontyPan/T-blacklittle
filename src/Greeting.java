
/**
 * 包含 System.out.print() 以及 for 迴圈的範例
 */
public class Greeting {
	public static void main(String[] args) {
		// →這是單行註解，在「//」之後打什麼都不會被靠北

		/*
		 * 這是多行註解，可以有很多行
		 * 也是一樣打什麼都不會被靠北
		 */

		//印出一行字，結尾有換行
		System.out.println("我以前和你一樣也是個冒險家，直到我的膝蓋中了一箭。");

		//印出兩行字，最後還有個換行
		System.out.println("我以前和你一樣也是個冒險家，");
		System.out.println("直到我的膝蓋中了兩箭。");

		//其實結果跟上一段一樣，只是示範「\n」的用法
		System.out.println("我以前和你一樣也是個冒險家，\n直到我的膝蓋中了三箭。");

		//其實結果跟上一段一樣，只是示範「print()」跟「println()」的差別
		//對「println()」可以不給東西，但是「print()」不行
		//你可以想一想為什麼
		System.out.print("我以前和你一樣也是個冒險家，");
		System.out.println();
		System.out.println("直到我的膝蓋中了四箭。");

		System.out.println("\n======== 我是分隔線 ========\n");

		//for 迴圈很類似數學符號的 sigma，可以設定一個變數的上下界
		//然後會把迴圈區塊內的程式碼執行 n 次
		//這裡的 foo 一開始是 5，然後限制他必須小於 10，每次增加一
		for (int foo = 5; foo < 10; foo = foo + 1) {
			System.out.println("我以前和你一樣也是個冒險家，直到我的膝蓋中了 " + foo + " 箭。");
		}
	}
}
