package single;

/**
 * @Package: single
 * @ClassName: Hungry
 * @Description: 饿汉式单例
 * @Author: 式神
 * @CreateDate: 2019/8/4 22:48
 */
public class Hungry {
    /**
     * 类初始化时立即加载这个对象
     * 线程安全的
     * 方法没有同步
     * 调用效率高
     */
    private static Hungry instance =new Hungry();
    private Hungry(){
    }
    public static Hungry getInstance(){
        return instance;
    }
}
