package ���սǽ�����;

import java.util.Scanner;

public class ����32 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("�ڿ���: ");
			String a = sc.nextLine();
			a.toCharArray();
			int sum=0;
			for(int i=0;i<a.length();i++) {
				sum+=(a.charAt(i)-48);
			}
			System.out.println("���: " + sum);
			sc.close();
		}

	}

