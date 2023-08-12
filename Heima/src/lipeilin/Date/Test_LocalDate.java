package lipeilin.Date;

import java.time.LocalDate;

public class Test_LocalDate {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        int year = ld.getYear();//年
        int month = ld.getMonthValue();// 月（1-12）
        int day = ld.getDayOfMonth();//日
        int dayOfYear = ld.getDayOfYear();//一年中的第几天
        int dayOfWeek = ld.getDayOfWeek().getValue();//星期几
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(dayOfWeek);
        System.out.println(dayOfYear);
    }
}
