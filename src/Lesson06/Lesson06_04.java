package Lesson06;

public class Lesson06_04 {
	public static void main(String args[]) {
		//Tv객체의 배열 생성 ==> 배열 길이 3
		Tv[] tvArr=new Tv[3];
		
		//Tv인스턴스를 생성하여 배열에 저장
		for(int i=0;i<tvArr.length;i++){
			tvArr[i]=new Tv();
			tvArr[i].channel=i+10; //생성된 Tv인스턴스의 채널값 할당
			System.out.printf("채널 변경전 tvArr[%d].channel=%d%n", i, tvArr[i].channel);
		}
		System.out.println();
		
		//배열에 저장된 Tv인스턴스의 채널값 변경
		for(int i=0;i<tvArr.length;i++){
			tvArr[i].channelUp(); //채널값 증가
			System.out.printf("채널 변경후 tvArr[%d].channel=%d%n", i, tvArr[i].channel);
		}
		
	}	
}
