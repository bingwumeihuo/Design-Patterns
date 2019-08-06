package factory;

/**
 * @Package: factory
 * @ClassName: CarFactory
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/8/6 14:58
 */
public class CarFactory {
    public static Aodi creatCar(String type){

           if ("奥迪".equals(type)) {
               return new Aodi();
           } else{
               return null;
           }

    }

}
