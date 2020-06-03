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
        month = 6;
    }

    public void setDay() {
        // 날짜 설정하기
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month - 1);
        c.set(Calendar.DATE, 1);

        // 첫날과 마지막일 구하기
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
        datePrint();
        underBlank();
    }

    public void printWeek() {
        // 요일을 화면에 출력하기
        String weekStr = "일월화수목금토";

        for (int i = 0; i < weekStr.length(); i++) {
            char ch = weekStr.charAt(i);
            System.out.print(ch + "\t");
        }
        System.out.println();
    }

    // 달력의 위의 빈칸 구하기
    public void aboveBlank() {
        // 첫날이 시작하는 요일 구하기
        int up = week - 1; // if 1일이 금요일이면 -> 6, 1일 당일에는 빈칸이 되면 안되니까 -1  
        for (int i = 0; i < up; i++) {
            System.out.print("*" + "\t");
        }
    }

    // 달력의 아래 빈칸 구하기
    public void underBlank() {
        for(int i = 0; i  < (7 - (week + lastDay - 1) % 7); i++){ // if lastDay가 31이고, 1일이 금요일이면 -> 6, 1일 당일에는 빈칸이 되면 안되니까 -1, 
            System.out.print("*" + "\t");
        }
        System.out.println();
    }

    // 날짜 출력하기
    public void datePrint() {
        for (int i = 0; i < lastDay; i++) {
            System.out.print(startDay + "\t");
            if ((startDay + week - 1) % 7 == 0) {
                System.out.println();
            }
            startDay++;
        }
    }
}
