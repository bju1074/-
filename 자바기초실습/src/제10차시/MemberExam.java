package ��10����;

public class MemberExam {

	public static void main(String[] args) {
		Student kim = new Student();
		kim.name = "������";
		kim.grade = 2;
		kim.telephone = "111-1111";
		System.out.println("�л��� �̸��� " + kim.name + "�̰�," + "�г���" + kim.grade + "�̰�, ��ȭ��ȣ��" + kim.telephone + "�Դϴ�.");
	}

}

class Student {
	public String name;
	int grade;
	int ban;
	int number;
	private String telephone;
}
