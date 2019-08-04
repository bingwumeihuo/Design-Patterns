package single;

/**
 * @Package: single
 * @ClassName: Slacker
 * @Description: 
 * @Author: 式神
 * @CreateDate: 2019/8/4 23:26
 */
public class Slacker {
    private static Slacker slacker;
    private  Slacker(){}
    public static synchronized Slacker getInstance(){
        if (slacker==null){
            slacker=new Slacker();
        }
        return slacker;
    }

}
