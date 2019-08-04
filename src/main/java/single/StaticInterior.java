package single;

/**
 * @Package: single
 * @ClassName: StaticInterior
 * @Description: 静态内部类单例
 * @Author: 式神
 */
public class StaticInterior {
   private static class SingletonClassInstance{
       private static final StaticInterior instance =new StaticInterior();
   }

    public static StaticInterior getInstance(){
        return SingletonClassInstance.instance;
    }
}
