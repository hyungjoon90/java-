package com.hb.pm;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/*
 * 991234-1234567
 * 001234-3456789
 * 001234-4456789
 * 001234-9456789
 * 19180221
 * 1908
 * �ֹι�ȣ�� �Է��ϼ���>123456-1234567
 * ����� 00�� �����Դϴ�
 * 
 * �ֹι�ȣ�� �Է��ϼ���>123456-2234567
 * ����� 00�� �����Դϴ�
 * 
 * �ֹι�ȣ�� �Է��ϼ���>1234561234567
 * '-'�� �������� ������
 * 
 * �ֹι�ȣ�� �Է��ϼ���>123456-123456
 * ��Ŀ� ���� �Է¹ٶ��ϴ� ex)000000-0000000
 * 
 * �ֹι�ȣ�� �Է��ϼ���>12345-1234567
 * ��Ŀ� ���� �Է¹ٶ��ϴ� ex)000000-0000000
 * 
 * �ֹι�ȣ�� �Է��ϼ���>���̻�����-���̻�����ĥ
 * ����� 00�� �����Դϴ�
 * 
*/

public class Ex02 {
	public static void main(String[] args) {

		char[] src={'1','2','3','4','5','6','7','8','9','0'};
		char[] target={'��','��','��','��','��','��','ĥ','��','��','��'};
		
		InputStream is = System.in;
		java.util.Scanner sc=null;
		sc=new Scanner(is);
		String msg=null;
		while(true){
			System.out.print("�ֹι�ȣ�� �Է��ϼ���>");
			msg=sc.nextLine();
			if(msg.length()==14){
				if(msg.charAt(6)=='-'){
					System.out.println(msg);
					char[] ch=msg.toCharArray();
					//////�ѱ�����//////
					for(int i=0; i<ch.length; i++){
						for(int idx=0; idx<target.length; idx++){
							if(ch[i]==target[idx]){
								ch[i]=src[idx];
							}
						}
					}
					msg=new String(ch);
					System.out.println(msg);
					////////////////////
					
					boolean result=true;
					for(int i=0; i<msg.length(); i++){
						if(i==6){
							continue;
						}
//						'0'<= msg.charAt(i) <='9'
//						'0'<= msg.charAt(i) && msg.charAt(i) <='9'
						if(msg.charAt(i)<'0' || msg.charAt(i)>'9'){result=false;}
					}
					if(result){
						break;
					}else{
						System.out.println("�峭���� ������");						
					}
				}else{
					System.out.println("'-'�� �������� ������");					
				}
			}else{
				System.out.println("��Ŀ� ���� �Է¹ٶ��ϴ� ex)000000-0000000");
			}
		}
		int age=0;
		String gender="�ܰ���";
		int su=(msg.charAt(0)-'0')*10+(msg.charAt(1)-'0');
		if(su>18){
			age=2018-(su+1900)+1;
		}else{
			age=2018-(su+2000)+1;			
		}
		switch (msg.charAt(7)) {
		case '1':
		case '3':
			gender="����";
			break;
		case '2':
		case '4':
			gender="����";
			break;
		case '8':
		case '9':
			gender="�ܱ���";
			break;
		}
		System.out.println("����� "+age+"�� "+gender+"�Դϴ�");
		
	}

}














