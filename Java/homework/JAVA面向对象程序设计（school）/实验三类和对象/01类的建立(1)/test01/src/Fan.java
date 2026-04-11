public class Fan {
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "蓝色";

    //创建带默认值的风扇的无参构造方法
    // 无参构造：使用默认值初始化
    public Fan() {
        // 成员变量已在声明时赋值，此处可省略显式赋值
    }

    //创建带指定风扇速度、半径、颜色和是否打开状态的风扇的构造方法
    // 有参构造：接收自定义参数初始化
    public Fan( int speed, boolean on, double radius, String color ){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    //一个名为print()的方法输出描述风扇的信息
    public void print(){
        if(on){
            System.out.printf("风扇的速度为：%d\n风扇的半径为：%f\n风扇的颜色为：%s\n",
                    speed, radius, color);
        }else {
            System.out.println("风扇未打开");
            System.out.printf("风扇的半径为：%f\n风扇的颜色为：%s\n",
                    radius, color);
        }
    }

}
