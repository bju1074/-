package ���սǽ�����;

public class ����27 {

	public static void main(String[] args) {
       for(int i=1;i<=30;i++) {
    	  String s=Integer.toString(i);
    	   if(s.contains("3")||s.contains("6")||s.contains("9")) {
    		   System.out.println(i+":¦");
    	   }
    	   else {
    		   System.out.println(i+"");
    	   }
       }
	}

}
