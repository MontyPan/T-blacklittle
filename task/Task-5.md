### 最大公因數 / 最小公倍數 ###

一樣也是增加一個 `Task5.java` 的檔案，`main()` 的內容大抵上如下，請補完：

```Java
int a = 12;
int b = 15;
int gcd;
int lcm;

//blacklittle：不會寫啦～ T__T

System.out.println(a + " 跟 " + b + " 的 GCD 為 " + gcd);
System.out.println(a + " 跟 " + b + " 的 LCM 為 " + lcm);
```

再次強調，這種東西隨便 google 就一定找得到程式碼，不過如果不自己想出來就沒啥意義。
~~而且你現在會的語法也寫不出來那種最佳化過的程式 [奸笑]~~
對，只能用我教過的語法（目前就 for 跟 if）

另外，請記得，`for-loop` 的格式是：

```Java
//X-block
for (A; B; C) {
  //D-block
}
//Y-block

//X -> A -> B -> D -> C -> B -> D -> C -> ... -> B -> Y
```

這裡只有要求「如果 B 有東西，B 運算完的結果得是 boolean」，其餘都沒有要求，
所以這種奇妙的 code 也是完全合法的（只是舉利用，沒事不要這樣亂搞 XD）

```Java
for (System.out.println("WTF?"); gcd==lcm; ) {
  System.out.println("LOL");
}
```
