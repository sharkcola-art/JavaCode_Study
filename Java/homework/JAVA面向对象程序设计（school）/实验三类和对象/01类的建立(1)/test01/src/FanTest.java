public class FanTest {
    public static void main(String[] args){
        Fan fan1 = new Fan();
        Fan fan2 = new Fan( 3, true, 10, "绿色" );

        System.out.println( "第一个风扇（默认值）：" );
        fan1.print();

        System.out.println();

        System.out.println( "第二个风扇（自定义值）：" );
        fan2.print();

    }
}
