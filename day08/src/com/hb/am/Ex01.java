package com.hb.am;

class Bike{
	// Ŭ���� �������
	// 1.�޼���
	// 2.����
	// 3.������
	
	// ��ü�� �Ӽ� - ��ü Ư��
	public int nowSpeed;
	public String color;
	public int maxSpeed;
	
	// ������
	public Bike(String a, int b){
		color=a;
		maxSpeed=b;
	}
	
	// ��ü�� ��� - ��ü ����
	public int speedUp(int speed){
		if(nowSpeed+speed<=maxSpeed){
			nowSpeed+=speed;
		}
		System.out.println(color+"�� ����ũ�� ����ӵ� "+nowSpeed+"km �Դϴ�");
		return nowSpeed;
	}
	
	public int speedDown(int speed){
		nowSpeed-=speed;
		System.out.println(color+"�� ����ũ�� ����ӵ� "+nowSpeed+"km �Դϴ�");
		return nowSpeed;
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		Bike me = new Bike("���",150);
//		me.color="���";
//		me.maxSpeed=150;
		
		Bike you = new Bike("����",100);
//		you.color="����";
//		you.maxSpeed=100;
		
		me.speedUp(10);
		you.speedUp(10);
		me.speedUp(30);
		you.speedUp(30);
		me.speedUp(50);
		you.speedUp(50);
		me.speedUp(10);
		you.speedUp(10);
		me.speedUp(10);
		you.speedUp(10);
		me.speedUp(10);
		you.speedUp(10);
		
		
	}

}













