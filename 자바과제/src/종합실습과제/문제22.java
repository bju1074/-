package ���սǽ�����;

import java.util.Scanner;

public class ����22 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		System.out.printf("��� : ");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.printf("%d ", i);
				sum++;
			}
		}
		System.out.printf("\n����� ���� : %d", sum);
	}
}
