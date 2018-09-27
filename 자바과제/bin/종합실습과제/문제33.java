package 종합실습과제;

import java.util.Scanner;

public class 문제33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수: ");
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
			System.out.println("판정결과: 대칭수(회문)");
		else
			System.out.println("판정결과: 비대칭수");

		sc.close();

	}

}
