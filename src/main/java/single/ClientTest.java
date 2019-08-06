package single;


import java.io.*;

/**
 * @Package: single
 * @ClassName: ClientTest
 * @Description: 测试反射和反序列化破解单例模式
 * @Author: 式神
 * @CreateDate: 2019/8/6 13:44
 */
public class ClientTest {
    public static void main(String[] args) throws IOException {
        StaticInterior s1 =StaticInterior.getInstance();
        StaticInterior s2=StaticInterior.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        FileOutputStream fos =new FileOutputStream("d:/a.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();
    }

}
