package com.bit.day07;

class Car{
	String model="";
	String color="��� ";
	int speed=0;
	int cnt=0;
	
	public void run(){
		int temp=1;
		
		if(model.equals("Ƽ��")){
			temp=2;
		}else if(model.equals("�ҳ�Ÿ")){
			temp=5;
		}else if(model.equals("�׷���")){
			temp=10;
		}
		
		cnt++;
		speed+=temp*cnt;
	}
	public void stop(){
		speed=0;
	}
	public void showSpeed(){
		System.out.println(color+model+"�� ������ ����ӵ�:"+speed);
	}
}


public class Ex08 {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.model="Ƽ��";
		myCar.showSpeed();
		myCar.run();
		myCar.showSpeed();
		myCar.run();
		myCar.showSpeed();
		myCar.stop();
		myCar.showSpeed();
		myCar=new Car();
		myCar.model="�ҳ�Ÿ";
		myCar.color="�˻� ";
		myCar.run();
		myCar.showSpeed();
		myCar.run();
		myCar.showSpeed();
		myCar.stop();
		myCar.showSpeed();
		myCar=new Car();
		myCar.model="�׷���";
		myCar.color="������ ";
		myCar.run();
		myCar.showSpeed();
		myCar.run();
		myCar.showSpeed();
		myCar.stop();
		
	}

}
