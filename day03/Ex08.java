class Ex08{

public static void main(String[] args){

	// ��� - �ݺ���
	// for��
	/*
	for(1.�ʱ�ȭ; 2.���ǽ�; 3.����){
		...4.��ɹ�;
	}
	
	1.->2.��(true)->4. ->3. ->2.��(true)->4.
	      ��(false)->out        ��(false)->out
	*/
	int a=0;

	for(a=10;a>0;a-=3){
	System.out.println("test..."+a);
	}
	System.out.println(a);


}// main end


}//class end