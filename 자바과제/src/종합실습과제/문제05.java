package ���սǽ�����;

import java.util.Scanner;

public class ����05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.close();
		System.out.printf("%02d�ð� %02d�� %02d��",a/3600 ,a/60%60 ,a%60);
		

	}

}
