package com.hb.pm;

public class Ex02 {

	public static void main(String[] args) {
		// �迭
		// �ڷ���[] ������ = new �ڷ���[����];
		// ������[�ε���]
		// 	�ε���
		// 	- 0���� ����, ���ӵ� ����
		//  - ���� = 0, �� = �迭����-1
		// �ʱ�ȭ
		// ������[�ε���]=�ʱⰪ;
		
		int[] arr1= new int[5];
		
		for(int i=0; i<5; i++){
			arr1[i]=i+1;
		}
		for(int i=0; i<5; i++){
			System.out.println("arr1["+i+"]="+arr1[i]);
		}
		
//		int a0=1;
//		int a1=4;
//		int a2=10;
//		int a3=6;
//		int a4=2;
		System.out.println("------------------------");
//		int[] arr2=new int[5]{1,4,10,6,2};
		int[] arr2=new int[]{1,4,10,6,2};
//		arr2[0]=1;
//		arr2[1]=4;
//		arr2[2]=10;
//		arr2[3]=6;
//		arr2[4]=2;
		for(int i=0; i<5; i++){
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		System.out.println("------------------------");
//		int[] arr3=new int[5]{1,4,10,6,2};
//		int[] arr3=new int[]{1,4,10,6,2};
		int[] arr3={1,4,10,6,2};
		for(int i=0; i<5; i++){
			System.out.println("arr3["+i+"]="+arr3[i]);
		}
		
	}

}
