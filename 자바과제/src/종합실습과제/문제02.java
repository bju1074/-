package 종합실습과제;

import java.util.Scanner;

public class 문제02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		System.out.printf("%d %d",a/b,a%b);

	}

}
