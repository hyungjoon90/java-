class Ex07{

	public static void main(String[] args){
	// ����
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.print("ù��° ��:");
	int a=sc.nextInt();
	System.out.print("�ι�° ��:");
	int b=sc.nextInt();
	System.out.print("1.���ϱ� 2.���� 3.���ϱ� 4.������:");
	int c=sc.nextInt();
	int d=0;
		switch(c){
			case 1: d=plus(a,b); break;
			case 2: d=minus(a,b); break;
			case 3: d=multi(a,b); break;
			case 4: d=div(a,b); break;
		}//switch end
	show(a,b,c,d);
	}//main end

	public static void show(int a, int b, int c, int d){
		// ��´��
		String st="����";
		switch(c){
			case 1: st="����"; break;
			case 2: st="��"; break;
			case 3: st="����"; break;
		}//switch end
		//System.out.print(""+a+ch+b+"="+d);
		//System.out.print(d+"="+a+ch+b);
		System.out.println(a+"�� "+b+"�� "+st+"�� "+d+"�Դϴ�");
	}

	public static int div(int a, int b){
		return a/b;
	}

	public static int multi(int a, int b){
		return a*b;
	}

	public static int minus(int a, int b){
		return a-b;
	}

	public static int plus(int a, int b){
		return a+b;
	}
	

}//class end