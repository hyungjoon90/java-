package com.bit.day07;

public class Ex03 {

	public static void main(String[] args) {
		Ex03 me;
		me = new Ex03();
		me.func01();

	}
//	�޼���
//	�̸� : ���ĺ� �ҹ��ڷν���
//			�ߺ�x
//	�����ε� : �ߺ����
//				������ ����,������ �ڷ���,������ ����
	public static void func01(){
		System.out.println("func01...");
	}
	public static void func01(int a){
		System.out.println("func01-a:"+a);
	}
	public void func01(int a, int b){
		System.out.println("func01-a:"+a+" , b:"+b);
	}
	public void func01(int a, String b){
		System.out.println("1func01-"+b+":"+a);
	}
	public void func01(String a, int b){
		System.out.println("2func01-"+a+":"+b);
	}

}
