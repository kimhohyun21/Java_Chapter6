package Lesson06;

public class Lesson06_04 {
	public static void main(String args[]) {
		//Tv��ü�� �迭 ���� ==> �迭 ���� 3
		Tv[] tvArr=new Tv[3];
		
		//Tv�ν��Ͻ��� �����Ͽ� �迭�� ����
		for(int i=0;i<tvArr.length;i++){
			tvArr[i]=new Tv();
			tvArr[i].channel=i+10; //������ Tv�ν��Ͻ��� ä�ΰ� �Ҵ�
			System.out.printf("ä�� ������ tvArr[%d].channel=%d%n", i, tvArr[i].channel);
		}
		System.out.println();
		
		//�迭�� ����� Tv�ν��Ͻ��� ä�ΰ� ����
		for(int i=0;i<tvArr.length;i++){
			tvArr[i].channelUp(); //ä�ΰ� ����
			System.out.printf("ä�� ������ tvArr[%d].channel=%d%n", i, tvArr[i].channel);
		}
		
	}	
}
