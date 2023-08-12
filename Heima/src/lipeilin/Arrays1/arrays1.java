package lipeilin.Arrays1;

import java.sql.Array;
import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class arrays1 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        String arr2 = Arrays.toString(arr);//打印数组元素
        System.out.println(arr2);
        int[] arr3 = Arrays.copyOfRange(arr,4,5);//copy时定义起始下标和结束下标，不包含结束下标的值
        System.out.println(Arrays.toString(arr3));
        int[] arr4 = Arrays.copyOf(arr3,10);//copy时自定义数组长度。当长度不足时只取定义长度的值
        int[] arr5 = Arrays.copyOf(arr3,2);
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));
        double[] price ={99.8,22.4,33.6};
        Arrays.setAll(price, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return price[value]*0.8;
            }
        });
        System.out.println(Arrays.toString(price));
    }
}
