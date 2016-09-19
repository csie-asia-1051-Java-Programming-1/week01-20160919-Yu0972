package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入體重單位 "公斤"，轉換成 "磅" (1磅 = 0.45359 公斤)
 * Date: 2016/09/19
 * Author: 105021045 郭毓呈
 */

import java.util.Scanner;
public class ex02_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scn = new Scanner(System.in);
		System.out.print("公斤=");
		float 公斤 = Scn.nextInt();
		System.out.println("磅="+公斤/0.45359);

	}

}
