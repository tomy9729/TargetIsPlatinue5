package week3;

import java.util.Scanner;

public class BJ_2753 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		if((x%4==0&&x%100!=0)||(x%400==0)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		sc.close();
	}

}
