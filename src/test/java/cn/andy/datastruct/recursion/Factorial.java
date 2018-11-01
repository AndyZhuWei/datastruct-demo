package cn.andy.datastruct.recursion;

/**
 * @Author: zhuwei
 * @Date:2018/11/1 14:41
 * @Description: 阶乘
 */
public class Factorial {

    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
}
