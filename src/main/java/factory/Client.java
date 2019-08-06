package factory;

/**
 * @Package: factory
 * @ClassName: Client
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/8/6 15:09
 */
public abstract class Client extends CarFactory implements car {
    public static void main(String[] args) {
       int  a=1;
       String b="2";
        System.out.println(a+b);
//       car c1= CarFactory.creatCar("benc");
//       c1.run();
    }
}
