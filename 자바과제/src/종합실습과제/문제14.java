package ���սǽ�����;

import java.util.Scanner;

public class ����14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m;
		System.out.print("��: ");
		m = sc.nextInt();
		
		switch(m) {
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: {
			System.out.println(m+"���� ������ ���� 31���Դϴ�.");
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11:{
			System.out.println(m + "���� ������ ���� 30���Դϴ�.");
			break;
		}
		default: System.out.println(m + "���� ������ ���� 28���Դϴ�.");
		}
		sc.close();

	}

}
