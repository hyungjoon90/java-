package com.hb.am;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// ���ڿ� String
		

		
		// String Ŭ������ Ư¡
		
		java.lang.String msg1="Hello";
		// ��ü, �ּ�
		String msg2="World";
		System.out.println(msg1+msg2);
		
		
		
		
		String msg3="Hello";
		System.out.println("1==3:"+(msg1==msg3));
		System.out.println("1eq3:"+(msg1.equals(msg3)));

		String msg5 = new String("Hello");
		System.out.println("���:"+msg5);
		System.out.println("1==5:"+(msg1==msg5));
		System.out.println("1eq5:"+(msg1.equals(msg5)));
		
		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�Է�:");
//		String msg4=sc.nextLine();
//		System.out.println("���:"+msg4);
//		System.out.println("msg1��4��:"+(msg1==msg4));

		
	}

}













