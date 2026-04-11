import java.util.Scanner;

public class ComplexTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //创建两个复数对象：
        System.out.print("第一个复数：");
        Complex c1 = new Complex( in.nextInt(), in.nextInt());
        System.out.println(c1.toString());
        System.out.print("第二个复数：");
        Complex c2 = new Complex( in.nextInt(), in.nextInt());
        System.out.println(c2.toString());

        //调用 complexAdd 方法，实现 c1 + c2
        Complex result = c1.complexAdd(c2);

        //输出结果，验证是否为 4+6i
        System.out.println("c1 + c2 = " + result);



    }
}
