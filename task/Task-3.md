繼續延用 Task-1 的變數 `input`。

增加一個 `Task3.java`，設法在 `input = 5` 的條件下，執行後可在 Console 看到下面的結果：


```
======== 我是分隔線 =========
*
**
***
****
*****
****
***
**
*
======== 我是分隔線 =========
```

有人恐嚇我說：「依照前兩個 Task 的速度，題目只有這樣簡直是在侮辱你的智商」 ~~（blacklittle：哪個混帳王八蛋）~~，
所以直接給你補上一個限制：「整個程式當中只能使用兩次 for 迴圈」。

你 **也許** 需要用到 `if-else` 語法（不會用到就算啦，反正也是要教）。
`if-else` 人如其名，就是在做「如果 P 成立就作 Q，反之就做 R」

```Java
if (P) {
	//Q 的程式碼
} else {
	//R 的程式碼
}
```

當然，可以沒有 else

```Java
if (P) {
	//Q 的程式碼
}
```

這邊針對 `P` 講深入一點。`P` 比較嚴謹的定義是「運算完的結果是個 boolean 值（要嘛 `true` 要嘛 `false` 的運算式」。
所以下面這幾個 if 都會印出東西出來

```Java
if (true) {	//「true」也是一個 Java keyword，true 運算完的結果當然還是 true
	System.out.println("有有有");
}

int a = 1;
int b = 2;
int c = 4;
if (a == 1) {	//如果 a 等於 1
	System.out.println("有有有");
}

if ((b * b == c) && (c * 4 > b * 2)) {	//如果「b 乘 b 等於 c」而且「c * 4 大於 b * 2」
	System.out.println("有有有");
}

if (true || false) {	//如果「真」或是「假」
	System.out.println("有有有");
}
```

好了，用上這些，至少就存在一個合理合法的 Task3.java 了...... [茶]
