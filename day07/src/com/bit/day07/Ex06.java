package com.bit.day07;

class BankCD{
	public int money=0;
	
	
	public void add(int b){
		money+=b;
	}
	public void del(int b){
		//
		if(money<b){
			System.out.println("ã���� �ݾ��� �����մϴ�");
			return;
		}
		money-=b;
	}
	public void show(){
		System.out.println("���� �ܰ�� "+money+"���Դϴ�");
	}
}


public class Ex06 {

	
	public static void main(String[] args) {
		int input=0;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		BankCD bank=new BankCD();
		while(true){
			System.out.print("1.�Ա� 2.��� 3.�ܰ�Ȯ�� 0.����>");
			input=sc.nextInt();
			if(input==1){
				System.out.print("�Ա��Ͻ� �ݾ�:");
				input=sc.nextInt();
				bank.add(input);
			}else if(input==2){
				System.out.print("����Ͻ� �ݾ�:");
				input=sc.nextInt();
				bank.del(input);
			}else if(input==3){
				bank.show();
			}else{
				break;
			}
		}
	}

}

















