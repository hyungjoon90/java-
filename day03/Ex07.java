/*
�����������α׷�

kor=95
eng=69
math=87;
.........
��� ���
�հ� : xxx
��� : xx.xx
���� : A����
.........
������ ����
A���� : ��� 90�̻�
B���� : ��� 80�̻�
C���� : ��� 70�̻�
D���� : ��� 60�̻�
F���� : ��� 60�̸�
*/

class Ex07{


public static void main(String[] args){

	System.out.println("-------------------");
	System.out.println("�����������α׷�");
	System.out.println("-------------------");

	int kor=100;
	int eng=100;
	int math=100;
	int sum=kor+eng+math;
	double avg=sum*100/3/100.0;

	System.out.println("�հ� : "+sum);
	System.out.println("��� : "+avg);
	switch((int)avg/10){
	case 10:
	case 9:
	System.out.println("���� : A����");
	break;
	case 8:
	System.out.println("���� : B����");
	break;
	case 7:
	System.out.println("���� : C����");
	break;
	case 6:
	System.out.println("���� : D����");
	break;
	default:
	System.out.println("���� : F����");
	break;
	}
	/*
	if(avg>=90){
	System.out.println("���� : A����");
	}else if(avg>=80){
	System.out.println("���� : B����");
	}else if(avg>=70){
	System.out.println("���� : C����");
	}else if(avg>=60){
	System.out.println("���� : D����");
	}else{
	System.out.println("���� : F����");
	}
	*/
}

}










