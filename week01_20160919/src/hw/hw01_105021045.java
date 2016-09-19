package hw;
/*
 * Topic: 假設我們要用二進制來表示 n 種狀態，請寫一個程式來計算記錄這 n 種狀態需要多少位元 (例如: n = 3 則需要 2bits)  (log(n)/log(2)
 * Date: 2016/09/19
 * Author: 105021045 郭毓呈
 */

import java.util.Scanner;
public class hw01_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scn = new Scanner(System.in);
		System.out.print( "n=" );
		int n = Scn.nextInt();
		double c= Math.ceil(Math.log(n)/Math.log(2));
		System.out.println("n種變化需要多少位元="+c);

	}

}
