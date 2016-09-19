package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入數字 a 與 b，程式 計算 a 的 b 次方後輸出結果 (請使用 Math.pow(a,b) 工具)
 * Date: 2016/09/19
 * Author: 105021045 郭毓呈
 */

import java.util.Scanner;
public class ex03_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scn = new Scanner(System.in);
		System.out.print("a=");
		float a = Scn.nextInt();
		System.out.print("b=");
		float b = Scn.nextInt();
		System.out.println("b="+Math.pow(a, b));

	}

}
