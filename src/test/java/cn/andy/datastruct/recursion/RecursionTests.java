package cn.andy.datastruct.recursion;

import cn.andy.datastruct.DemoApplicationTests;
import org.junit.Test;

/**
 * @Author: zhuwei
 * @Date:2018/11/1 14:27
 * @Description:
 */
public class RecursionTests extends DemoApplicationTests {

    /**
     * 测试三角数字
     */
    @Test
    public void test1() {
        int random = (int)(Math.random()*100);
        int theAnswer = Triangle.triangle(random);
        System.out.println("第"+random+"项的数字是"+theAnswer);
    }

    /**
     * 测试阶乘
     */
    @Test
    public void test2() {
        int random = (int)(Math.random()*100);
        int theAnswer = Factorial.factorial(random);
        System.out.println("第"+random+"项的数字是"+theAnswer);
    }

    /**
     * 测试变为字
     */
    @Test
    public void test3() {
       Anagram anagram = new Anagram("cats");
       anagram.anagram();
    }
}
