package lipeilin.study1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Simpledate {
    public static void main(String[] args) throws ParseException {
        String start = "2023年11月11日 0:0:0";
        String end = "2023年11月11日 0:10:0";
        String xj = "2023年11月11日 0:01:18";
        String xp = "2023年11月11日 0:10:27";

        //把字符串转换成日期对象
        SimpleDateFormat spf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startd = spf.parse(start);
        Date endd = spf.parse(end);
        Date xjd = spf.parse(xj);
        Date xpd = spf.parse(xp);

        long startdt = startd.getTime();
        long enddt = endd.getTime();
        long xjdt = xjd.getTime();
        long xpdt = xpd.getTime();

        if (xjdt >= startdt && xjdt <=enddt){
            System.out.println("恭喜xj秒杀成功");
        }else{
            System.out.println("您失败了");
        }
        if (xpdt >= startdt && xpdt <=enddt){
            System.out.println("恭喜xp秒杀成功");
        }else{
            System.out.println("您失败了");
        }
    }
}
