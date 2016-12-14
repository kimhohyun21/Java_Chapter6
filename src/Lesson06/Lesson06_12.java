package Lesson06;

public class Lesson06_12 {
	public static void main(String[] args){
		int[] arr={3,2,1,6,5,4};
		
		System.out.print("���� �迭 ��� : ");
		printArr(arr);
		sortArr(arr); // �迭 ������������ ����
		System.out.print("�迭 �������� ��� : ");
		printArr(arr);
		System.out.println("�迭�� �� ��� : "+sumArr(arr));
	}
	
	static void printArr(int[] arr){ //�迭�� ����ϴ� �޼���
		System.out.print("[");
		
		for(int i : arr){
			System.out.print(i+",");
		}
		System.out.println("]");
	}
	
	static int sumArr(int[] arr){//�迭�� ��� ��Ҹ� ���ϴ� �޼���
		int sum=0;
		
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		
		return sum;
	}
	
	static void sortArr(int[] arr){ //�迭�� ������������ �����ϴ� �޼���
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
