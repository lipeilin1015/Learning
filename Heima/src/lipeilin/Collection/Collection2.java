package lipeilin.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @version: java version 1.8
 * @Author: LiPeiLin
 * @description:
 * @date: 2023-08-19 15:09
 */
public class Collection2 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("java1");
        c.add("java2");
        c.add("java3");
        c.add("java4");
        System.out.println(c);

        Iterator<String> it = c.iterator();
        while (it.hasNext()){
            String es = it.next();
            System.out.println(es);
        }
        for (String ele:c){
            System.out.println(ele);
        }
    }
}
