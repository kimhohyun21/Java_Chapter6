package Lesson6;

public class Lesson6_08 {
	public static void main(String[] args){
		System.out.println("main 시작");
		firstMethod();
		System.out.println("main 끝");
	}	
	
	static void firstMethod(){
		System.out.println("첫번째 메서드 시작");
		secondMethod();
		System.out.println("첫번째 메서드 끝");
	}
	
	static void secondMethod(){
		System.out.println("두번째 메서드 시작");
		System.out.println("두번째 메서드 끝");
	}
}