package ���սǽ�����;

import java.util.Scanner;

public class ����07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    sc.useDelimiter("\r|\n|,");
		int a=sc.nextInt();
	    int b=sc.nextInt();
	    sc.close();
	    System.out.println("a AND b: " +(a&b));
	    System.out.println("a OR b: " +(a|b));
	    System.out.println("NOT a: " +(~a));
	    System.out.println("a XOR b: " +(a^b));
	    System.out.println("a NAND b: " +(~(a&b)));
	    System.out.println("a NOR b: " +(~(a|b)));
	    

	}

}
