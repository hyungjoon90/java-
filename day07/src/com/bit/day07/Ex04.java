package com.bit.day07;

public class Ex04 {
	// Ŭ������ �������
	// 1. �޼��� (static, non-static)
	// 2. ���� (static[Ŭ��������], non-static[�ɹ��ʵ�])
	//		�⺻���� ����
	// 		����� �ʱ�ȭ ���ÿ� 
	public static int sum=10000;// Ŭ��������

	
	public static void main(String[] args) {
		int temp;
		
		Ex04 me = new Ex04();
		temp=1000;
		sum=me.add(temp);
		System.out.println("sum="+sum);
		temp=200;
		sum=me.del(temp);
		System.out.println("sum="+sum);
		temp=300;
		sum=me.del(temp);
		System.out.println("sum="+sum);
		
	}
	
	public int add(int b){
		return sum+b;
	}
	public int del(int b){
		return sum-b;
	}
	

}
