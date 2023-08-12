package lipeilin.study1;

import java.util.Date;

public class TestDate1 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);



        //拿到时间毫秒值,从1970年1月1日至今
        long time = d.getTime();
        System.out.println(time);
        Date a1 =new Date(12222222);
        System.out.println(a1);
        Date a2 = new Date();
        a1.setTime(time);
        System.out.println(a1);
        System.out.println("-----------------");
        Date f = new Date();
        System.out.println(f.getTime());
        System.out.println(f);
    }
}
