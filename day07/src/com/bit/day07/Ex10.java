package com.bit.day07;

/*
 * �ڵ���
 * 
 * �ִ�ӵ�(km) > 150
 * 
 * 1.���� 2.�����ũ 3.����ӵ� 0.����>3
 * 
 * ����ӵ� : 0km
 * 
 * 1.����(+10) 2.����(-10) 3.����ӵ� 0.����>1
 * 
 * ����ӵ� : 10km
 * 
 * ...
 * 
 * 1.����(+10) 2.����(-10) 3.����ӵ� 0.����>1
 * 
 * ����ӵ� : 150km
 * 
 * 1.����(+10) 2.����(-10) 3.����ӵ� 0.����>1
 * 
 * ����ӵ� : 150km
 * 
 * ...
 * 
 * 1.����(+10) 2.����(-10) 3.����ӵ� 0.����>2
 * 
 * ����ӵ� : 140km
 * 
 * 1.����(+10) 2.����(-10) 3.����ӵ� 0.����>2
 * 
 * ����ӵ� : 140km
 * 
 * ...
 * 
 * 1.����(+10) 2.����(-10) 3.����ӵ� 0.����>2
 * 
 * ����ӵ� : 0km
 * 
 * 1.����(+10) 2.����(-10) 3.����ӵ� 0.����>2
 * 
 * ����ӵ� : 0km
 * 
 * 
 * 
*/
class MyCar{
	int max,speed;
	
	public void add(){
		if(speed+30<=max){
			speed+=30;
		}else{
			speed=max;
			}
	}
	public void stop(){
		if(speed-30>=0){
			speed-=30;
		}else{
			speed=0;
			}
	}
	public void show(){
		System.out.println("����ӵ� : "+speed);
	}
	
}
public class Ex10 {

	public static void main(String[] args) {
		MyCar my = new MyCar();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("-------------------");
		System.out.println("�ڵ�������");
		System.out.println("-------------------");
		System.out.print("�ִ�ӵ�(km) > ");
		my.max=sc.nextInt();
		int input=0;
		while(true){
		System.out.print("1.����(+30) 2.����(-30) 3.����ӵ� 0.���� >");
		input=sc.nextInt();
			if(input==1){
				my.add();
				my.show();
			}else if(input==2){
				my.stop();
				my.show();				
			}else if(input==3){
				my.show();
			}else{
				break;
			}
		}
		
		
	}

}















