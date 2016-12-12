package Lesson6;

public class Lesson6_03 {
	public static void main(String args[]) {
		Tv tv1=new Tv();    //참조변수 Tv1으로 TV 인스턴스를  생성
		Tv tv2=new Tv();    //참조변수 Tv2으로 TV 인스턴스를  생성
		System.out.println("tv1의 현재 채널은 "+tv1.channel+"입니다.");
		System.out.println("tv2의 현재 채널은 "+tv2.channel+"입니다.");
		System.out.println();
		
		tv2=tv1; 		//참조변수 tv1의 주소값을 tv2에 저장
		tv1.channel=7;  //참조변수 tv1의 멤버변수 channel의 값 변경
		System.out.println("tv1의 채널을 "+tv1.channel+"로 변경하였습니다.");
		System.out.println();
		
		System.out.println("tv1의 현재 채널은 "+tv1.channel+"입니다.");
		System.out.println("tv2의 현재 채널은 "+tv2.channel+"입니다.");
		System.out.println();
	}	
}
