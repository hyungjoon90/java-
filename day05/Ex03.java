// �ּ� : ���α׷��Ӱ� �ҽ��ڵ带...
// ���� �ּ�
/*
	���� �ּ�
*/

class Ex03{

public static void main(String[] args){
	/* 
	���
	   �������ǹ�(���� ~~ �̶��) 
	   ��   if��(if,if else, if else if else), switch��
	   �����ݺ���	
		for��, while��, do~while��
		for(�ʱ�ȭ;����;����){}
		�ʱ�ȭ; while(����){����;}
		�ʱ�ȭ; do{����;}while(����);
	*/
	switch(1){
		case 1: System.out.println("1 run"); break;
		case 2: System.out.println("2 run");
	}


	for(int a=0; a<5; a++){
		break;
		System.out.println("for��"+(a+1)+"��");
	}
	System.out.println("-------------------------");
	int b=0;
	boolean result=true;
	while(true){
		System.out.println("while��"+(b+1)+"��");
		if(b==4){break;}
		b++;
	}
	System.out.println("b="+b);
}

}





