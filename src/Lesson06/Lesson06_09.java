package Lesson06;

class Data{ int x; }

public class Lesson06_09 {
	public static void main(String[] args){
		Data data=new Data();
		data.x=10; 
		System.out.println("main() : x = "+data.x);
		
		change(data.x); 
		// change()���� �⺻�� �Ű������� ���� �о���̱⸸ �ϰ� ���ο� ������ �ݿ����� ����
		System.out.println("After change(data.x)");
		System.out.println("main() : x = "+data.x); 
	}
	
	static void change(int x){ // int x ==> �⺻�� �Ű�����
		x=1000;
		System.out.println("change() : x = "+x);
	}
}
