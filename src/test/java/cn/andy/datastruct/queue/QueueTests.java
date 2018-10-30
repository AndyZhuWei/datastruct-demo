package cn.andy.datastruct.queue;

import cn.andy.datastruct.DemoApplicationTests;
import cn.andy.datastruct.StackX.BracketChecker;
import cn.andy.datastruct.StackX.Reserver;
import cn.andy.datastruct.StackX.StackX;
import org.junit.Test;

import java.io.IOException;
import java.util.Scanner;

/**
 * @Author: zhuwei
 * @Date:2018/10/29 11:43
 * @Description:
 */
public class QueueTests extends DemoApplicationTests {

    @Test
    public void test() {
       Queue theQueue = new Queue(5);

        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);

        theQueue.remove();
        theQueue.remove();
        theQueue.remove();

        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);

        while(!theQueue.isEmpty()) {
            long n = theQueue.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println(" ");

    }

    @Test
    public void test2() {
        PriorityQ theQ = new PriorityQ(5);

        theQ.insert(30);
        theQ.insert(50);
        theQ.insert(10);
        theQ.insert(40);
        theQ.insert(20);

        while(!theQ.isEmpty()) {
            long n = theQ.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println(" ");

    }
}
