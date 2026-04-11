public class Complex {
    private int realPart = 0;
    private int imaginPart = 0;

    //一个创建带默认值的复数的构造方法
    public Complex(){

    }

    //一个创建带指定实数部分、虚数部分的复数的构造方法
    public Complex( int realPart, int imaginPart ){
        this.realPart = realPart;
        this.imaginPart = imaginPart;
    }
    //一个创建带指定实数部分、虚数部分的复数的构造方法
    public Complex complexAdd(Complex c){
        int realPartSum = this.realPart + c.realPart;
        int imaginPartSum = this.imaginPart + c.imaginPart;

        return new Complex( realPartSum, imaginPartSum );
    }

    //把当前复数对象的实部和虚部组合成a+bi的字符串形式，其中a和b分别为实部和虚部数据
    public String toString(){
        return realPart + "+" + imaginPart + "i";
    }

}
