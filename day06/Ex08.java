class Ex08{

public static void main(String[] args){

	//Ex08.func01();
	Ex08 me;
	me=new Ex08();
	System.out.println(me);
	me=new Ex08();
	System.out.println(me);
	//me.func02();
	//me.func03();
}//main end

// static -> static : (Ŭ������).�޼����();

// static -> non-static : ��ü ���� �� ���������� ���� ����
//			ex)��������=��ü����; ��������.�޼����();

// non-static -> static : (Ŭ������).�޼����();

	public static void func01(){
		System.out.println("func01");
		Ex08 me;
		me=new Ex08();
		me.func02();
	}
	public void func02(){
		System.out.println("func02");
		func03();
	}
	public void func03(){
		//func01();
		System.out.println("func03");
	}



}//class end









