package Lesson06;

public class Lesson06_13 {
	public static void main(String[] args) {
		Lesson06_13 returnTest=new Lesson06_13(); // �ڱ� �ڽ��� �ν��Ͻ� ����
		
		int result=returnTest.add(3, 5);
		System.out.println("int ���� �޼��� add�� ���ϰ� : "+result);
		
		int[] result2={0}; //�迭 ���� �ʱ�ȭ
		returnTest.add(3, 5, result2);
		System.out.println("void�� �޼��� add���� ��ȯ�� �迭 �� : "+result2[0]);
	}
	
	int add(int a, int b){
		return a+b; //�Ű������� ���� ���� �����Ͽ� ����
	}
	
	void add(int a, int b, int[] result){
		result[0]=a+b; //�Ű������� ���� �迭�� ���갪�� ����
	}
}
