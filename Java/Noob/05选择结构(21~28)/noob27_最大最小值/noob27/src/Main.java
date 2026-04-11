import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = a;
        int min = a;

        //判断最大值
        if(max < b){
            max = b;
            if(max < c){
                max = c;
            }
        }
        else if (max < c) {
            max = c;
        }
        //判断最小值
        if(min > b){
            min = b;
            if(min > c){
                min = c;
            }
        }
        else if (min > c) {
            min = c;
        }

//        // 一行代码完成“争冠军”：先让a和b比，胜者再和c比
//        int max = Math.max(Math.max(a, b), c);
//        // 一行代码完成“争垫底”：先让a和b比，负者再和c比
//        int min = Math.min(Math.min(a, b), c);
//
//        // 专业注释解读：
//        // Math.max(a, b) 返回a和b中的较大者，形象比喻为“第一轮淘汰赛的胜者”。
//        // 外层Math.max(第一轮胜者, c) 即“胜者与c进行总决赛”，决出最终冠军(max)。
//        // min的逻辑与之镜像相反。

        System.out.printf("The maximum number is : %d\n", max);
        System.out.printf("The minimum number is : %d\n", min);

        in.close();
    }
}
