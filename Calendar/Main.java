package Calendar;

import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		setCalendar sC = new setCalendar();
		sC.goCalendar();
	}
}

class setCalendar {
	int year, month;
	int startDay, lastDay, week;
	Calendar c = Calendar.getInstance();
	
	public void goCalendar() {
		init();
		setDay();
		printCalendar();
	}
	
	public void init() {
		year = 2021;
		month = 5;
	}
	
	public void setDay() {
		//날짜 설정하기
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month - 1);
		c.set(Calendar.DATE, 1);
		
		//첫날과 마지막일 구하기
		week = c.get(Calendar.DAY_OF_WEEK);
		lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		startDay = 1;
	}
	
	public void printCalendar() {
		System.out.println(year + "년 " + month + "월");
		System.out.println("=================================================================");
		
		printWeek();
		
		System.out.println("=================================================================");
		aboveBlank();
	}
	
	public void printWeek() {
		//요일을 화면에 출력하기 
		String weekStr = "일월화수목금토";
		
		for (int i = 0; i < weekStr.length(); i++) {
			char ch = weekStr.charAt(i);
			System.out.print(ch + "   ");
		}
		System.out.println();
	}
	
	public void aboveBlank() {
		for (int i = 0; i < week; i++) {
			System.out.print("*" + "\t");
		}
	}
    
    public void underBlank() {
        
    }
	
}
