package com.hb.pm;

// ��			limit =1
// �� ��			limit =2
// �� �� ��		limit =3
// �� �� �� ��		limit =4

// 1		1*1
// 22		10*2+1*2
// 333		100*3+10*3+1*3
// 4444		1000*4+100*4+10*4+1*4 

// 1		"1"
// 22		"2"+"2"
// 333		"3"+"3"+"3"
// 4444		"4"+"4"+"4"+"4"

//��				
//�� ��			
//�� �� ��				
//�� �� �� ��			


public class Ex08 {

	public static void main(String[] args) {
//		String[] str={"��","�� ��","�� �� ��","�� �� �� ��"};
		String[] str=new String[4];
		String stars="";
		for(int i=0; i<str.length; i++){
//			if(i==0){
//				str[i]="��";
//			}else{
//				str[i]=str[i-1]+"��";
//			}
			stars="";
			for(int j=0; j<i+1; j++){
				stars+="��";
			}
			str[i]=stars;
		}
		
		for(int i=0; i<str.length; i++){
			System.out.println(str[i]);
		}
	}

}








