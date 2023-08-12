package lipeilin.study1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import static java.time.LocalDate.parse;

public class TeatDate2 {
    public static void main(String[] args) throws ParseException {
        Date a =new Date();
        long b = a.getTime();

        //格式化时间格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String c = sdf.format(a);
        String d = sdf.format(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        Date g = sdf.parse(d);
        System.out.println(g);
    }
}
