package lipeilin.study1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class bigdecimal {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.3;
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal c1 = a1.add(b1);
        System.out.println(c1);
        BigDecimal a2 = BigDecimal.valueOf(0.1);
        BigDecimal b2 = BigDecimal.valueOf(0.3);
        BigDecimal c2 = a2.divide(b2,2, RoundingMode.HALF_UP);
        System.out.println(c2);
        double k = c2.doubleValue();
    }
}
