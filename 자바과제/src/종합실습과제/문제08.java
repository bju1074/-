package ���սǽ�����;

import java.util.Scanner;

public class ����08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter("\r|\n|,");
		int a=sc.nextInt();
		System.out.printf("����:%d\n",a);
	    System.out.printf("����:%d",a<0?-a:a);
	    sc.close();

	}

}
