package Lesson6;

public class Lesson6_10 {
	public static void main(String[] args){
		Data data=new Data();
		data.x=10; 
		System.out.println("main() : x = "+data.x);
		
		change(data); 
		// change()�� ������ �Ű������� �־��� ������ x���� ���ο� ������ �ݿ�
		System.out.println("After change(data.x)");
		System.out.println("main() : x = "+data.x); 
	}
	
	static void change(Data data){ // Data data ==> ������ �Ű�����
		data.x=1000;
		System.out.println("change() : x = "+data.x);
	}
}	