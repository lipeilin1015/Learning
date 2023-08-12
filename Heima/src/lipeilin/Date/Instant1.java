package lipeilin.Date;

import java.time.Instant;

public class Instant1 {
    public static void main(String[] args) {
        Instant in1 = Instant.now();
        System.out.println(in1);
        System.out.println(in1.getEpochSecond());
        System.out.println(in1.getNano());
        System.out.println(in1.plusMillis(111));
    }
}
