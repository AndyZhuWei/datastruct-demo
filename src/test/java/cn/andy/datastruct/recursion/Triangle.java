package cn.andy.datastruct.recursion;

/**
 * @Author: zhuwei
 * @Date:2018/11/1 14:25
 * @Description: 三角数字
 * 1,3,6,10,15,21，... 这个序列中的数字被称为三角数字,这个数列中的第n项是由第n-1项加n得到的
 */
public class Triangle {

    public static int triangle(int n) {
        System.out.println("Entering:n="+n);
        if(n==1) {
            System.out.println("Returning 1");
            return 1;
        } else {
            int temp = (n+triangle(n-1));
            System.out.println("Returning "+temp);
            return temp;
        }
    }

}
