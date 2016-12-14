package Lesson06;

//TV 객체 클래스 선언
class Tv{
	//멤버변수 선언(속성)
	String color; 
	boolean power;
	int channel;
	
	//TV의 기능 선언
	void power(){ power=!power; }
	void channelUp(){ ++channel; }
	void channelDown(){ --channel; }
}

public class Lesson06_01 {
	public static void main(String args[]) {
		Tv tv=new Tv();    //참조변수 Tv1으로 TV 인스턴스를  생성
		tv.channel=7;      //채널 값 할당
		tv.channelDown();  //채널 값 변경
		int ch=tv.channel; //채널 값 변수로 선언
		
		System.out.println("현재 TV채널은 "+ch+"입니다.");
	}	
}
