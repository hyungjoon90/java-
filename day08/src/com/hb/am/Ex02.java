package com.hb.am;

public class Ex02 {
	// ������ 
	// ��ǥ�� ��� - �ʵ��� �ʱ�ȭ
	// �����ε� ����
	int sum;
	
	public Ex02(){
		
	}
	
	public Ex02(int a){
		System.out.println("������ �ߵ�");
		sum=a;
	}
	
	public static void main(String[] args) {
		Ex02 me = new Ex02();
		System.out.println("sum="+me.sum);
		me = new Ex02(1004);
		System.out.println("sum="+me.sum);
	}

}
