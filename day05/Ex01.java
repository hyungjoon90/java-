class Ex01{

public static void main(String[] args){ //�޼���
	int a=100;
	a=10;
	//a=010; 8����
	a=0xa;
	System.out.println("16���� ����a="+a);
	a=0xb;
	System.out.println("16���� ����a="+a);
	a=0xc;
	System.out.println("16���� ����a="+a);
	a=0xd;
	System.out.println("16���� ����a="+a);
	a=0xe;
	System.out.println("16���� ����a="+a);
	a=0xf;
	System.out.println("16���� ����a="+a);
	a=0x10;
	System.out.println("16���� ����a="+a);
	// ������ ���� : �ڷ��� ������;
	// �ʱ�ȭ(���� ���� ����) : ������=��;
	// ��: 10���� ����
	//byte
	//short
	//int
	//long
	// ��: �Ǽ�
	//float
	//double
	System.out.println("----------------------");
	double b1=1.000000001f;
	double b2=1.0000002f;
	double b3=b1+b2;//2.000000000000021;
	System.out.println(b3);
}

}