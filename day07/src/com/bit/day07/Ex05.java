package com.bit.day07;

public class Ex05 {
	public static int a=1234;	//Ŭ��������
	
	public int b=1234;			//�ɹ��ʵ�
	
	

	public static void main(String[] args) {
		Ex05 me =new Ex05();
		
		System.out.println("static:"+Ex05.a);
		System.out.println("non-static:"+me.b);
		me.a--;
		me.b--;
		System.out.println("static:"+Ex05.a);
		System.out.println("non-static:"+me.b);
		me.a--;
		me.b--;
		System.out.println("static:"+Ex05.a);
		System.out.println("non-static:"+me.b);
		me.a--;
		me.b--;
		System.out.println("static:"+Ex05.a);
		System.out.println("non-static:"+me.b);
		me.a--;
		me.b--;
		System.out.println("static:"+Ex05.a);
		System.out.println("non-static:"+me.b);
		me=new Ex05();
		me.a--;
		me.b--;
		System.out.println("static:"+Ex05.a);
		System.out.println("non-static:"+me.b);
		
	}

}












