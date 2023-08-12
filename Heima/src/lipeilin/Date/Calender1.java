package lipeilin.Date;

import java.util.Calendar;

public class Calender1 {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.println(now);
        //获取日历中的某个信息
        int year = now.get(Calendar.YEAR);
        System.out.println(year);
        int Month = now.get(Calendar.MONTH+1);
        System.out.println(Month);
    }
}
