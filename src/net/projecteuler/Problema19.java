package net.projecteuler;

import java.util.Calendar;

public class Problema19 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.MONTH, 0);
		cal.set(Calendar.YEAR, 1901);
		cal.getTime();
		int c=0, i=0;
		while(i<365*100){
			if(cal.get(Calendar.DAY_OF_MONTH) == 1 && cal.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
				c++;
			
			cal.add(Calendar.DAY_OF_MONTH, 1);
			i++;
		}
		System.out.println("count:"+c);
	}
}
