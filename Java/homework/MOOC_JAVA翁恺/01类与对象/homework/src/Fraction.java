public class Fraction {
    private int a0;
    private int b0;

    //构造函数
    Fraction(int a, int b){
        a0 = a;
        b0 = b;
        reduceFraction();
    }

    //将分数转换为double
    public double toDouble(){
        return (double) a0/b0;
    }

    //this+r
    public Fraction plus(Fraction r){
        int newa0 = this.a0*r.b0 + this.b0*r.a0;
        int newb0 = this.b0*r.b0;
        return new Fraction(newa0, newb0).reduceFraction();
    }

    //this*r
    public Fraction multiply(Fraction r){
        int newa0 = this.a0*r.a0;
        int newb0 = this.b0*r.b0;
        return new Fraction(newa0, newb0).reduceFraction();
    }

    // 静态方法：计算两个数的最大公约数（欧几里得算法）
    public static int getGcd(int a0, int b0){
        //取绝对值，确保正数
        int a = Math.abs(a0);
        int b = Math.abs(b0);
        //处理边界情况
        if(a == 0)
        {
            return a;
        }
        if(b == 0)
        {
            return b;
        }

        while (b != 0){
            int c = a % b;// 求余数
            a = b;      // 原除数变被除数
            b = c;      // 余数变除数
        }

        return a;// 当b=0时，a就是最大公约数
    }

    public Fraction reduceFraction(){
        // 1. 计算分子和分母的GCD
        int gcd = getGcd(this.a0, this.b0);

        // 2. 约分（分子、分母除以GCD）
        a0 = a0/gcd;
        b0 = b0/gcd;

        return this;
    }
    //输出分数形式
    public void printFraction(){
        if(a0 == b0)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(a0 + "/" + b0);
        }
    }

    public void printDouble(){
        System.out.println(toDouble());
    }
}
