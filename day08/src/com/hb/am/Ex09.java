package com.hb.am;

public class Ex09 {
	// ��������
	// static : Ŭ��������, static����
	// non-static : �ɹ��ʵ�, non-static����
	int sum=100;
	static int sum2=1000;

	public static void main(String[] args) {
		System.out.println(Ex09.sum2);
		func01(200);
		System.out.println(Ex09.sum2);
		
	}
	
//	�޼��� - �Լ�
	static void func01(int sum2){
		com.hb.am.Ex09.sum2=sum2;
	}

}// class end
