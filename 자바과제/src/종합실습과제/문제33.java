package ���սǽ�����;

import java.util.Scanner;

public class ����33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڿ���: ");
		String a = sc.nextLine();
		int l = a.length() - 1;
		int i;
		int cnt = 0;
		for (i = 0; i < l / 2; i++) {
			if (a.charAt(i) == a.charAt(l - i))
				cnt++;
			if (i == l)
				break;

		}
		if (cnt == l / 2)
			System.out.println("�������: ��Ī��(ȸ��)");
		else
			System.out.println("�������: ���Ī��");

		sc.close();

	}

}
