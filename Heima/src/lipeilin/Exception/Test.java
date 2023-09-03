package lipeilin.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @version: java version 1.8
 * @Author: LiPeiLin
 * @description:
 * @date: 2023-08-15 8:44
 */
public class Test {
    public static void main(String[] args) {
        try {
            SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(sm.parse("2022-11-12 12:23:12"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
