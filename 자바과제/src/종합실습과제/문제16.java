package ���սǽ�����;

import java.util.Scanner;

public class ����16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n;
		System.out.print("�� ����: ");
		m = sc.nextInt();
		n = sc.nextInt();

		for (int i = m; i <= n; i++)
			System.out.print(i + " ");
		sc.close();
	}

}
