package single;

/**
 * @Package: single
 * @ClassName: Client
 * @Description: Java类作用
 * @Author: 式神
 */
public class Client {
    public static void main(String[] args) {
        StaticInterior s1 =StaticInterior.getInstance();
        StaticInterior s2=StaticInterior.getInstance();
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(Enumeration.instance==Enumeration.instance);
    }
}
