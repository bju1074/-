package ��3����;

public class �ǽ�03 {

	public static void main(String[] args) {
		int a=0, b=0;
		a++; b++;
		a+=15; b+=a;
		a-=1; b*=a;
		a/=2; b%=3;
		a&=13; b|=a;
		System.out.println("a="+ a + ",b=" + b);
		
		double c=5.5, d=3, e;
		e=c%d;
		System.out.println(e);
		
		String f1="��Ű�";
		String f2="��Ű�";
		String g1=new String("��Ű�");
		String g2=new String("��Ű�");
		System.out.println((f1==f2) + "," + (g1==g2));
		System.out.println(f1.equals(f2) + "," + g1.equals(g2));
		

	}

}
