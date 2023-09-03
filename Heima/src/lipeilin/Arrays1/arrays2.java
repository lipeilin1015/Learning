package lipeilin.Arrays1;

/**
 * @version: java version 1.8
 * @Author: LiPeiLin
 * @description:
 * @date: 2023-08-14 16:34
 */
public class arrays2 {
    public static void main(String[] args) {
//        int[][] scores = new int[][];
        int[] arr ={12,123,43,5,43,22,3};
        arrays2 arrays=new arrays2();
        System.out.println(arrays.findln(arr,3));
    }
    public  int findln(int[] array, int x){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==x){
                return i;
            }
        }
        return -1;
    }
}
