package Lesson6;

public class Lesson6_10 {
	public static void main(String[] args){
		Data data=new Data();
		data.x=10; 
		System.out.println("main() : x = "+data.x);
		
		change(data); 
		// change()에 참조형 매개변수를 주었기 때문에 x값을 새로운 값으로 반영
		System.out.println("After change(data.x)");
		System.out.println("main() : x = "+data.x); 
	}
	
	static void change(Data data){ // Data data ==> 참조형 매개변수
		data.x=1000;
		System.out.println("change() : x = "+data.x);
	}
}	