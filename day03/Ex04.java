class Ex04{

public static void main(String[] args){

 System.out.println("------------------");
 System.out.println("xxxx���α׷�");
 System.out.println("------------------");
 System.out.println("�޴��� �����ϼ���");
 System.out.print("(1.���� 2.�Է� 3.���� 0.����)>>>");
 int input=2;
 System.out.println(input);
 if(input<0 || input>3){
	System.out.println("�߸��Է��ϼ̽��ϴ�");
 }else if(input<=1){
	System.out.println("���� ����");
 }else if(input<=2){
	System.out.println("�Է� ����");
 }else if(input<=3){
	System.out.println("���� ����");
 }
}

}