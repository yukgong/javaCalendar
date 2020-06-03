package Calendar;

import java.util.Calendar;

public class week {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2020);
        c.set(Calendar.MONTH, 6 - 1);
        c.set(Calendar.DATE, 1);

        c.get(Calendar.YEAR);
        c.get(Calendar.MONTH);
        c.get(Calendar.DATE);

        int weekday = c.get(Calendar.DAY_OF_WEEK); // 요일을 1 ~ 7까지의 숫자로 표현한다. 각 숫자는 일 ~ 토요일을 의미한다.

        System.out.println(weekday);
    }
}