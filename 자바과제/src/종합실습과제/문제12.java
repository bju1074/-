package 종합실습과제;

import java.util.Scanner;

public class 문제12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
		System.out.printf("%d,%d",a ,b);
		c=(a+b)/2;
		if(c>=60 && a>=40 && b>=40) {
			System.out.printf("\n합격");			
		}
		else {
			System.out.printf("\n불합격(과락)");
		}
		sc.close();

	}

}
