public class Factorial {

    // 计算阶乘的方法：输入整数n，返回n的阶乘（int类型）
    public int calculateFactorial(int n) {
        // 处理特殊情况：0! = 1，1! = 1；若n为负数，可抛异常或返回特定值（这里简化为返回1）
        if (n < 0) {
            // 负数没有阶乘，可根据需求抛异常（如IllegalArgumentException）
            throw new IllegalArgumentException("负数没有阶乘！");
        }
        // 0!和1!的结果都是1
        if (n == 0 || n == 1) {
            return 1;
        }
        // 阶乘的核心逻辑：累乘（从2到n，依次相乘）
        int factorial = 1; // 初始值为1（因为乘法的单位元是1）
        for (int i = 2; i <= n; i++) { // 从2开始乘，直到n
            factorial *= i; // 等价于 factorial = factorial * i
        }
        return factorial; // 返回计算结果
    }

    //循环1!+2!+...+n!
    public int getResult(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += calculateFactorial(i);
        }
        return sum;
    }

}
