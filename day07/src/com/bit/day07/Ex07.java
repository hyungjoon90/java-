package com.bit.day07;

class ����CD{
	public int �ܰ�;
	
	public void �Ա��Ѵ�(int ��){
		�ܰ�+=��;
		System.out.println("�Ա��մϴ�");
	}
	
	public void ����Ѵ�(int ��){
		�ܰ�-=��;
		System.out.println("����մϴ�");
	}
	
	public void �ܰ�Ȯ���Ѵ�(){
		System.out.println("���� �ܰ� : "+�ܰ�);
	}
	
}


public class Ex07 {

	public static void main(String[] args) {
		����CD cd = new ����CD();
		cd.�Ա��Ѵ�(1000);
		cd.�ܰ�Ȯ���Ѵ�();
		cd.����Ѵ�(500);
		cd.�ܰ�Ȯ���Ѵ�();
	}

}
