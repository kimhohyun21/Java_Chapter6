package Lesson06;

//TV ��ü Ŭ���� ����
class Tv{
	//������� ����(�Ӽ�)
	String color; 
	boolean power;
	int channel;
	
	//TV�� ��� ����
	void power(){ power=!power; }
	void channelUp(){ ++channel; }
	void channelDown(){ --channel; }
}

public class Lesson06_01 {
	public static void main(String args[]) {
		Tv tv=new Tv();    //�������� Tv1���� TV �ν��Ͻ���  ����
		tv.channel=7;      //ä�� �� �Ҵ�
		tv.channelDown();  //ä�� �� ����
		int ch=tv.channel; //ä�� �� ������ ����
		
		System.out.println("���� TVä���� "+ch+"�Դϴ�.");
	}	
}
