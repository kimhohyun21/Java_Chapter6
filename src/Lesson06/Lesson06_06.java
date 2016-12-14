package Lesson06;

//사칙연산 클래스 선언
class MyMath{
	//long형 더하기 메서드
	long add(long a, long b){
		return a+b;
	}
	
	//long형 빼기 메서드
	long subtract(long a, long b){
		return a-b;
	}
		
	//long형 곱하기 메서드
	long multiply(long a, long b){
		return a*b;
	}
	
	//long형 나누기 메서드
	double divide(double a, double b){
		return a/b;
	}
}

public class Lesson06_06 {
	public static void main(String[] args){
		MyMath myMath=new MyMath();
		
		long addResult=myMath.add(5L, 3L);
		long subtractResult=myMath.subtract(5L, 3L);
		long multiplyResult=myMath.multiply(5L, 3L);
		double divideResult=myMath.divide(5D, 3D);  //소수점까지 결과 표현을 위해 double형으로 선언
		
		System.out.println("add(5L, 3L) = "+addResult);
		System.out.println("subtract(5L, 3L) = "+subtractResult);
		System.out.println("multiply(5L, 3L) = "+multiplyResult);
		System.out.println("divide(5D, 3D) = "+divideResult);		
	}
}
