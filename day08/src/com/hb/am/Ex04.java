package com.hb.am;

import com.hb.pm.Ex06;

class Ex44{
	// ����������
	// ���������� [static] �ڷ��� ������;
	// public > default > private
	// private���� �������� ���� Ŭ���� ���ο����� �������
	// default ���� ��Ű�� ���ο����� �������
	// public ��𼭵� ���� ���
	
	// �ʵ��� ����������
	
	public int su1=1111;
	int su2=2222;
	private int su3=3333;
	
	public void func01(){
		System.out.println(su1);
		System.out.println(su2);
		System.out.println(su3);
		System.out.println("�ۺ� �޼���");
	}
	void func02(){
		System.out.println("����Ʈ �޼���");
	}
	private void func03(){
		System.out.println("private �޼���");		
	}
	
}


public class Ex04 {
	

	public static void main(String[] args) {
		Ex44 ex1=new Ex44();
		System.out.println(ex1.su1);
		System.out.println(ex1.su2);
//		System.out.println(ex1.su3);
		Ex05 ex5=new Ex05();
		System.out.println(ex5.su4);
//		System.out.println(ex5.su5);
		System.out.println(ex5.su6);
		
		Ex06 ex6 = new Ex06();
		System.out.println(ex6.su7);
//		System.out.println(ex6.su8);
//		System.out.println(ex6.su9);
		
	}

}
