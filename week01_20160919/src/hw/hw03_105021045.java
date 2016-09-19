package hw;
/*
 * Topic: 請寫一個程式讓使用者輸入 6 個數(可以有小數)的值，每一個值都取四捨五入後輸出這 6 個數中的最小值
 * Date: 2016/09/19
 * Author: 105021045 郭毓呈
 */

import java.util.Scanner;
public class hw03_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("n1=");
		float n1 = scn.nextFloat();
		System.out.print("n2=");
		float n2 = scn.nextFloat();
		float test1=Math.min(Math.round(n1), Math.round(n2));
		System.out.print("n3=");
		float n3=scn.nextFloat();
		float test2= Math.min(test1, Math.round(n3));
		System.out.print("n4=");
		float n4= scn.nextFloat();
		float test3= Math.min(test2, Math.round(n4));
		System.out.print("n5=");
		float n5 = scn.nextFloat();
		float test4 =Math.min(test3, Math.round(n5));
		System.out.print("n6=");
		float n6 = scn.nextFloat();
		float test5 = Math.min(test4, Math.round(n6));
		System.out.print("6個數四捨五入後的最小值="+test5);
		
	}

}
