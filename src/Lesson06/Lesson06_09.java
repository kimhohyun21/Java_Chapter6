package Lesson06;

class Data{ int x; }

public class Lesson06_09 {
	public static void main(String[] args){
		Data data=new Data();
		data.x=10; 
		System.out.println("main() : x = "+data.x);
		
		change(data.x); 
		// change()에서 기본형 매개변수로 값을 읽어들이기만 하고 새로운 값으로 반영하지 못함
		System.out.println("After change(data.x)");
		System.out.println("main() : x = "+data.x); 
	}
	
	static void change(int x){ // int x ==> 기본형 매개변수
		x=1000;
		System.out.println("change() : x = "+x);
	}
}
