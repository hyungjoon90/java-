class Ex06{

public static void func01(){
	System.out.println("func01 run...");
	return ;
}//func01 end

public static byte func03(){
	return 127;
}

public static void main(String[] args){
	System.out.println("main start");
	// �ڹ��� �⺻����
	// �ڹ��� �⺻ ���
	// �޼���
	int su=func03();
	System.out.println(su);
	System.out.println("main end");
}//main�޼��� end

// �޼��� ����
// public static [void ||�ڷ���] �޼����̸�(����...){
// 	���๮;
// 	return [x];
// }


public static int func02(int i, int j){
	int x=i;
	int y=j;
	int z=x+y;
	return z;
}

}//class end