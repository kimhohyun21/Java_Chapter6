package Lesson06;

public class Lesson06_12 {
	public static void main(String[] args){
		int[] arr={3,2,1,6,5,4};
		
		System.out.print("원래 배열 출력 : ");
		printArr(arr);
		sortArr(arr); // 배열 오름차순으로 정렬
		System.out.print("배열 오름차순 출력 : ");
		printArr(arr);
		System.out.println("배열의 합 출력 : "+sumArr(arr));
	}
	
	static void printArr(int[] arr){ //배열을 출력하는 메서드
		System.out.print("[");
		
		for(int i : arr){
			System.out.print(i+",");
		}
		System.out.println("]");
	}
	
	static int sumArr(int[] arr){//배열의 모든 요소를 합하는 메서드
		int sum=0;
		
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		
		return sum;
	}
	
	static void sortArr(int[] arr){ //배열을 오름차순으로 정렬하는 메서드
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
	}
}
