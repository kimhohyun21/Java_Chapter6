package Lesson6;

public class Lesson6_03 {
	public static void main(String args[]) {
		Tv tv1=new Tv();    //�������� Tv1���� TV �ν��Ͻ���  ����
		Tv tv2=new Tv();    //�������� Tv2���� TV �ν��Ͻ���  ����
		System.out.println("tv1�� ���� ä���� "+tv1.channel+"�Դϴ�.");
		System.out.println("tv2�� ���� ä���� "+tv2.channel+"�Դϴ�.");
		System.out.println();
		
		tv2=tv1; 		//�������� tv1�� �ּҰ��� tv2�� ����
		tv1.channel=7;  //�������� tv1�� ������� channel�� �� ����
		System.out.println("tv1�� ä���� "+tv1.channel+"�� �����Ͽ����ϴ�.");
		System.out.println();
		
		System.out.println("tv1�� ���� ä���� "+tv1.channel+"�Դϴ�.");
		System.out.println("tv2�� ���� ä���� "+tv2.channel+"�Դϴ�.");
		System.out.println();
	}	
}
