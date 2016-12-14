package Lesson06;

//card 객체 선언
class Card{
	String kind;          //카드 무늬 - 인스턴스 변수
	int number;           //카드 넘버 - 인스턴스 변수  
	static int width=100; //카드 폭 - 클래스(객체) 변수
	static int height=250;//카드 높이 - 클래스(객체) 변수
}

public class Lesson06_05 {
	public static void main(String[] args){
		//클래스 변수는 인스턴스 생성 없이 바로 사용가능
		System.out.println("Card.width = "+Card.width); 
		System.out.println("Card.height = "+Card.height); 
		
		//카드 인스턴스 생성
		Card cd1=new Card();
		cd1.kind="Heart";
		cd1.number=7;
		
		//카드 인스턴스를 새로 생성
		Card cd2=new Card();
		cd2.kind="Spade";
		cd2.number=4;
		
		System.out.println("cd1은 "+cd1.kind+" "+cd1.number+", 크기 ("+cd1.width+", "+cd1.height+")");
		System.out.println("cd2은 "+cd2.kind+" "+cd2.number+", 크기 ("+cd2.width+", "+cd2.height+")");		
	}
}
