package single;

/**
 * @Package: single
 * @ClassName: Slacker
 * @Description: 懒汉式单例
 * @Author: 式神
 */
public class Slacker {
    /**
     * 类初始化时不加载这个对象
     * 线程安全的
     */
    private static Slacker slacker;
    private  Slacker(){}

    /**
     *  方法同步
     *  调用效率低
     * @return
     */
    public static synchronized Slacker getInstance(){
        if (slacker==null){
            slacker=new Slacker();
        }
        return slacker;
    }

}
