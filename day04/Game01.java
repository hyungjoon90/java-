/*

���������� ����(ver 0.0.1)
-----------------------------------------
1.���� 2.���� 3.�� >>>1
��� : ����
��ǻ�� : ��
��� : �̰��
����Ͻðڽ��ϱ�?(1.��� 0.����):1
1.���� 2.���� 3.�� >>>1
��� : ����
��ǻ�� : ����
��� : ����
����Ͻðڽ��ϱ�?(1.��� 0.����):1
1.���� 2.���� 3.�� >>>1
��� : ����
��ǻ�� : ����
��� : ����
����Ͻðڽ��ϱ�?(1.��� 0.����):0
���� 1�� 0�� 2��
�̿����ּż� �����մϴ�
*/

class Game{

	public static void main(String[] args){
		Game game=new Game();

		while(true){
		int me=game.input(1,3,"1.���� 2.���� 3.��>>>");
		int com=game.com();
		System.out.println("���:"+game.data(me));
		System.out.println("��ǻ��:"+game.data(com));
		int su=game.result(me, com);
		if(su==-1){
			System.out.println("����");
		}else if(su==1){
			System.out.println("�̰��");
		}else{
			System.out.println("����");
		}
		su=game.input(0,1,"����Ͻðڽ��ϱ�?(1.��� 0.����):");
			if(su==0){
				break;
			}
		}
		System.out.println("�����մϴ�!!!!");
	}

	public String data(int su){
		String msg="��";
		if(su==1){
			msg="����";
		}else if(su==2){
			msg="����";
		}
		return msg;
	}

	public int input(int start,int end,String msg){
		// 1~3
		// 0~1
		
		int su=-1;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		while(true){
			if(su<start || su>end){

				System.out.print(msg);
				su=sc.nextInt();
			}else{
				break;
			}
		}
		return su;
	}

	public int com(){
		// 1~3
		// 0<=Math.random<1
		// -1 0~2 -> 0<=Math.random<3
		int su=(int)(Math.random()*3)+1;
		return su;
	}

	public int result(int me, int com){
		// ����(-1), ����(0), �̰��(1)
		int su=0;
		if(me==1 &&com==2){
			su=-1;
		}else if(me==1 &&com==3){
			su=1;
		}else if(me==2 && com==1){
			su=1;
		}else if(me==2 && com==3){
			su=-1;
		}else if(me==3 && com==1){
			su=-1;
		}else if(me==3 && com==2){
			su=1;
		}else{
			su=0;
		}

		return su;
	} 

}












