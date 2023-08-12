package lipeilin.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateFormatter {
    public static void main(String[] args) {
        //创建一个日期时间格式化对象
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

        //对时间进行格式化
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        //格式化
        String rs = now.format(formatter);
        System.out.println(rs);


        //反向格式化
        String rs2 = formatter.format(now);
        System.out.println(rs2);

        //解析时间

        String datestr = "2028年11月12日 12:20:20";
        LocalDateTime lsd = LocalDateTime.parse(datestr,formatter);
        System.out.println(lsd);
        System.out.println("-------------------------");
        LocalDate start = LocalDate.of(2015,1,1);
        LocalDate end = LocalDate.of(2023,5,6);
        Period dd = Period.between(start,end);
        System.out.println(dd.getYears());
        System.out.println(dd.getMonths());
        System.out.println(dd.getDays());

    }
}
