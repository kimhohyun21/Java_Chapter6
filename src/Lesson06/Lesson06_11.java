package Lesson06;

public class Lesson06_11 {
	public static void main(String[] args) {
		int[] x={10};
		System.out.println("main() : x = "+x[0]);
		
		change(x); //�޼��� ȣ��
		System.out.println("After change(x)");
		System.out.println("main() : x = "+x[0]); // ������ �Ű������� ���� ����
	}
	
	static void change(int[] x){ //������ �Ű������� ���� �޼���
		x[0]=1000;
		System.out.println("change() : x = "+x[0]);
	}
}
