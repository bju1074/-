package ���սǽ�����;

public class ����23 {

	public static void main(String[] args) {
		int count =0;
		int total= 0;
		for(int i=1;i<=1000;i++) {
			if((i%3==0) || (i%5==0)) {
				count++;
				total+=i;
			}
		}
		System.out.println("���� : "+count);
		System.out.println("�հ� : "+total);
	}
 
}
