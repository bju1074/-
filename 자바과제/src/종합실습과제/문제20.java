package ���սǽ�����;

import java.util.Scanner;

public class ����20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("�ֹε�Ϲ�ȣ12�ڸ� :");
		String a = sc.nextLine();
		char pn[]=a.toCharArray();
		int  s=0;
		for(int i=0;i<=11;i++) {
			pn[i]-='0';
			s+=pn[i]*(i%8+2);
		}
		int t=s%11;
		System.out.println("13��°�� :"+(11-t)%10);

	}

}
