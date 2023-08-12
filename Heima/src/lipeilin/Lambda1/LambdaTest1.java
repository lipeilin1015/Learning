package lipeilin.Lambda1;

/**
 * @version: java version 1.8
 * @Author: LiPeiLin
 * @description:
 * @date: 2023-08-07 10:52
 */
public class LambdaTest1 {
    public static void main(String[] args) {
//        Animal a = new Animal(){
//            @Override
//            public void run() {
//                System.out.println("狗跑的贼快~~");
//            }
//        };
//        a.run();
        Animal s = ()->
                System.out.println("狗跑的贼快~~");
        s.run();
    }
}
interface Animal{
      void run();
}