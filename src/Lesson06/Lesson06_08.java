package Lesson06;

public class Lesson06_08 {
	public static void main(String[] args){
		System.out.println("main ����");
		firstMethod();
		System.out.println("main ��");
	}	
	
	static void firstMethod(){
		System.out.println("ù��° �޼��� ����");
		secondMethod();
		System.out.println("ù��° �޼��� ��");
	}
	
	static void secondMethod(){
		System.out.println("�ι�° �޼��� ����");
		System.out.println("�ι�° �޼��� ��");
	}
}