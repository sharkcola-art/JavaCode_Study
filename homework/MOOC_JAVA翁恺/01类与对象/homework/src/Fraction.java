public class Fraction{
    private int a0;
    private int b0;

    public Fraction(int a, int b){
        a0 = a;
        b0 = b;
    }

    public double toDouble(){
        return (double)a0/b0;
    }

    public Fraction plus(Fraction r){
        int newa0 = this.a0 * r.b0 + this.b0 * r.a0;
        int newb0 = this.b0 * r.b0;
        return new Fraction(newa0, newb0);
    }

    public Fraction multiply(Fraction r){
        int newa0 = this.a0 * r.a0;
        int newb0 = this.b0 * r.b0;
        return new Fraction(newa0, newb0);
    }

    void print(){
        System.out.println(a0 + "/" + b0);
    }
}