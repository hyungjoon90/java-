/*
Q1. 1~10���� �� ¦���� ����Ͻÿ�
	-> 2 4 6 8 10

Q2. 1~50������ �հ踦 ���Ͻÿ�
	-> 1~50�� �հ�� xxx�Դϴ�

Q3. ������ 7���� ����Ͻÿ�
	7x1=7
	7x2=14
	7x3=21
	...
	7x9=63
*/

class Ex09{

public static void main(String[] args){
	for(int a=2;a<=10; a++){
	System.out.print(a+" ");
	a++;
	}
	System.out.println("------------------");
	int sum=0;
	for(int a=1; a<=50; a++){
		sum+=a;//sum=sum+a;
	}
	System.out.println("1~50�� �հ�� "+sum+"�Դϴ�");
	System.out.println("------------------");
	int dan=2;
	for(int a=1; a<10; a++){
	System.out.println(dan+"x"+a+"="+dan*a);
	}
}

}














