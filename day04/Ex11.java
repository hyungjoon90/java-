class Ex11{

public static void main(String[] args){
	boolean end=true;
	while(end){

	System.out.println("-----------------------------");
	System.out.println("�л��������α׷� (ver 0.0.1)");
	System.out.println("-----------------------------");
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.print("����:");
	int kor=sc.nextInt();
	System.out.print("����:");
	int eng=sc.nextInt();
	System.out.print("����:");
	int math=sc.nextInt();

	System.out.println("-----------------------------");
	System.out.println("���");
	System.out.println("-----------------------------");
	int sum=kor+eng+math;
	System.out.println("�հ�:"+sum);
	double avg=sum*100/3/100.0;
	System.out.println("���:"+avg);

	int grade=0;

	switch((int)(avg/10)){
		case 0: case 1: case 2: case 3:
		case 4: case 5:
			grade+=2;
		case 6:
			grade+=1;
		case 7:
			grade+=1;
		case 8:
			grade+=1;
		case 9: case 10:
			grade+=65;
	}
	System.out.println("����: "+(char)grade);

	System.out.print("1.��� 0.����");
		if(sc.nextInt()==0){
			end=!end;
		}
	}
	System.out.println("�̿����ּż� �����մϴ�!!!");

}


}






