package ���սǽ�����;

import java.util.Scanner;

public class ����45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڿ��� n: ");
		int n = sc.nextInt();
		int arr[][] = new int[n+1][n+1];
		arr[1][1]=1;
		System.out.println("[�Ľ�Į�� �ﰢ��]");
		for(int i = 2;i <= n;i++) {
			for(int j = 1;j <= i;j++) {
				arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
			}
		}
		for(int i = 1;i <= n;i++) {
			for(int j = 1;j <= i;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
