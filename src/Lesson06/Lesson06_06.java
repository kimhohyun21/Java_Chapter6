package Lesson06;

//��Ģ���� Ŭ���� ����
class MyMath{
	//long�� ���ϱ� �޼���
	long add(long a, long b){
		return a+b;
	}
	
	//long�� ���� �޼���
	long subtract(long a, long b){
		return a-b;
	}
		
	//long�� ���ϱ� �޼���
	long multiply(long a, long b){
		return a*b;
	}
	
	//long�� ������ �޼���
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
		double divideResult=myMath.divide(5D, 3D);  //�Ҽ������� ��� ǥ���� ���� double������ ����
		
		System.out.println("add(5L, 3L) = "+addResult);
		System.out.println("subtract(5L, 3L) = "+subtractResult);
		System.out.println("multiply(5L, 3L) = "+multiplyResult);
		System.out.println("divide(5D, 3D) = "+divideResult);		
	}
}
