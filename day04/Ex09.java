class Ex09{

  public static void main(String[] args){
	// ����
	// 0 <= ran < 1
	//int ran=(int)(Math.random()*8)+2;
	// 2 ~ 9
	// 0~7

	int ran=0;
	boolean result=true;
	while(result){
		ran=(int)(Math.random()*10);
		if(ran>1&&ran<10){
			result=!result;
		}
	}
	int su=1;
	while(su<10){
	System.out.println(ran+"��"+su+"="+ran*su);
	su++;
	}

  }

}