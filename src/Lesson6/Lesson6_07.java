package Lesson6;

public class Lesson6_07 {
	public static void main(String[] args){
		firstMethod();// 첫번째 메서드 호출
	}
	
	static void firstMethod(){
		secondMethod(); // 두번째 메서드를 호출
	}
	
	static void secondMethod(){
		System.out.println("두번째 메서드");
	}
}


