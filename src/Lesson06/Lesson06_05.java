package Lesson06;

//card ��ü ����
class Card{
	String kind;          //ī�� ���� - �ν��Ͻ� ����
	int number;           //ī�� �ѹ� - �ν��Ͻ� ����  
	static int width=100; //ī�� �� - Ŭ����(��ü) ����
	static int height=250;//ī�� ���� - Ŭ����(��ü) ����
}

public class Lesson06_05 {
	public static void main(String[] args){
		//Ŭ���� ������ �ν��Ͻ� ���� ���� �ٷ� ��밡��
		System.out.println("Card.width = "+Card.width); 
		System.out.println("Card.height = "+Card.height); 
		
		//ī�� �ν��Ͻ� ����
		Card cd1=new Card();
		cd1.kind="Heart";
		cd1.number=7;
		
		//ī�� �ν��Ͻ��� ���� ����
		Card cd2=new Card();
		cd2.kind="Spade";
		cd2.number=4;
		
		System.out.println("cd1�� "+cd1.kind+" "+cd1.number+", ũ�� ("+cd1.width+", "+cd1.height+")");
		System.out.println("cd2�� "+cd2.kind+" "+cd2.number+", ũ�� ("+cd2.width+", "+cd2.height+")");		
	}
}
