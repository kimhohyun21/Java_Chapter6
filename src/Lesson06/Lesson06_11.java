package Lesson06;

public class Lesson06_11 {
	public static void main(String[] args) {
		int[] x={10};
		System.out.println("main() : x = "+x[0]);
		
		change(x); //메서드 호출
		System.out.println("After change(x)");
		System.out.println("main() : x = "+x[0]); // 참조형 매개변수의 값을 변경
	}
	
	static void change(int[] x){ //참조형 매개변수를 가진 메서드
		x[0]=1000;
		System.out.println("change() : x = "+x[0]);
	}
}
