package com.hb.am;

import java.util.Date;

public class Ex08 {

	public static void main(String[] args) {
		for(int i=1; i<10; i++){
			Date d = new Date();
			int year=d.getYear()+1900;
			int month=d.getMonth()+1;
			int date=d.getDate();
			int h=d.getHours();
			int m=d.getMinutes();
			int s=d.getSeconds();
			System.out.println(year+"��"+month+"��"+date+"��"+h+":"+m+":"+s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}

}
