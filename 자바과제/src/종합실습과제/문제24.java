package ���սǽ�����;

public class ����24 {

	public static void main(String[] args) {
		System.out.println("[ASCII �ڵ�ǥ]");
		for(int i=32;i<=127;i++) {
			System.out.printf("%3d %c  ", i, (char)i);
			if((i%10)==1)
				System.out.println();
		}

	}

}
