package ���սǽ�����;

import java.util.Scanner;

public class ����12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
		System.out.printf("%d,%d",a ,b);
		c=(a+b)/2;
		if(c>=60 && a>=40 && b>=40) {
			System.out.printf("\n�հ�");			
		}
		else {
			System.out.printf("\n���հ�(����)");
		}
		sc.close();

	}

}
