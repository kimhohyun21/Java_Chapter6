package Lesson06;

public class Lesson06_13 {
	public static void main(String[] args) {
		Lesson06_13 returnTest=new Lesson06_13(); // 자기 자신의 인스턴스 생성
		
		int result=returnTest.add(3, 5);
		System.out.println("int 리턴 메서드 add의 리턴값 : "+result);
		
		int[] result2={0}; //배열 생성 초기화
		returnTest.add(3, 5, result2);
		System.out.println("void형 메서드 add으로 변환된 배열 값 : "+result2[0]);
	}
	
	int add(int a, int b){
		return a+b; //매개변수로 받은 값을 연산하여 리턴
	}
	
	void add(int a, int b, int[] result){
		result[0]=a+b; //매개변수로 받은 배열에 연산값을 저장
	}
}
