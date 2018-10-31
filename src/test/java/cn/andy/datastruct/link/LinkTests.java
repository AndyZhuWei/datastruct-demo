package cn.andy.datastruct.link;

import cn.andy.datastruct.DemoApplicationTests;
import cn.andy.datastruct.array.LowArray;
import cn.andy.datastruct.array.OrderedArray;
import org.junit.Test;

/**
 * @Author: zhuwei
 * @Date:2018/10/29 11:43
 * @Description: 链表相关的测试
 */
public class LinkTests extends DemoApplicationTests {

    /**
     * 测试单链表
     */
    @Test
    public void test() {
        LinkList theList = new LinkList();

        theList.insertFirst(22,2.99);
        theList.insertFirst(44,4.99);
        theList.insertFirst(66,6.99);
        theList.insertFirst(88,8.99);

        theList.displayList();

        while(!theList.isEmpty()) {
            Link aLink = theList.deleteFirst();
            System.out.print("Deleted");
            aLink.displayLink();
            System.out.println(" ");
        }
        theList.displayList();
    }


    /**
     * 测试单链表
     */
    @Test
    public void test2() {
        LinkList theList = new LinkList();

        theList.insertFirst(22,2.99);
        theList.insertFirst(44,4.99);
        theList.insertFirst(66,6.99);
        theList.insertFirst(88,8.99);

        theList.displayList();

        Link f = theList.find(44);
        if(f!=null) {
            System.out.println("Found link with key "+f.iData);
        } else {
            System.out.println("Can't find link");
        }

        Link d = theList.delete(66);
        if(d!=null) {
            System.out.println("Found link with key "+d.iData);
        } else {
            System.out.println("Can't find link");
        }

        theList.displayList();
    }

    /**
     * 测试双端链表
     */
    @Test
    public void test3() {
        FirstLastList theList = new FirstLastList();

        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);

        theList.insertLast(11);
        theList.insertLast(33);
        theList.insertLast(55);

        theList.displayList();

        theList.deleteFirst();
        theList.deleteFirst();

        theList.displayList();
    }

    /**
     * 测试用链表结构实现的栈
     */
    @Test
    public void test4() {
       LinkStack theStack = new LinkStack();

        theStack.push(20);
        theStack.push(40);

        theStack.displayStack();

        theStack.push(60);
        theStack.push(80);

        theStack.displayStack();

        theStack.pop();
        theStack.pop();

        theStack.displayStack();
    }

}
