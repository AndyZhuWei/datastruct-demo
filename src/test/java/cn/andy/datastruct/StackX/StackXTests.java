package cn.andy.datastruct.StackX;

import cn.andy.datastruct.DemoApplicationTests;
import cn.andy.datastruct.array.LowArray;
import cn.andy.datastruct.array.OrderedArray;
import org.junit.Test;

import java.io.*;
import java.util.Scanner;

/**
 * @Author: zhuwei
 * @Date:2018/10/29 11:43
 * @Description: 数组相关的测试
 */
public class StackXTests extends DemoApplicationTests {

    @Test
    public void test() {
        StackX theStack = new StackX(10);//make new stack

        theStack.push(20); //push items onto stack
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        while(!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }

    @Test
    public void test2() {
        Reserver reserver = new Reserver("abcdefg");
        String str = reserver.doReserver();
        System.out.println(str);
    }

    @Test
    public void test3() throws IOException {
        String inputStr = null;
        BracketChecker bracketChecker = new BracketChecker(inputStr);
        while(true) {
            System.out.println("Please enter string contains delimiters:");
            inputStr = getString();
            if("break".equals(inputStr)) {
                break;
            }
            bracketChecker.check();
        }
    }
    private String getString() throws IOException {
//        InputStream inputStream = System.in;
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//        return bufferedReader.readLine();

        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        return str;
    }


    /**
     * 测试中缀表达式转换成后缀表达式
     * @throws IOException
     */
    @Test
    public void test4() throws IOException {
        String el = "9+(3-1)*3+1/2";
        RPN rpn = new RPN(el);
        String lastEL = rpn.getLastEL();
        System.out.println(lastEL);
    }

    @Test
    public void test5() throws IOException {
        String el = "9+(3-1)*3";
        FourOperations fo = new FourOperations(el);
        System.out.println(fo.getResult());
    }
}
