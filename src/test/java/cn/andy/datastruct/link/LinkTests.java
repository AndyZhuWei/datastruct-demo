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


    /**
     * 测试用链表结构实现的队列
     */
    @Test
    public void test5() {
        LinkQueue theQueue = new LinkQueue();

        theQueue.insert(20);
        theQueue.insert(40);

        theQueue.displayQueue();

        theQueue.insert(60);
        theQueue.insert(80);

        theQueue.displayQueue();

        theQueue.remove();
        theQueue.remove();

        theQueue.displayQueue();
    }

    /**
     * 测试用链表结构实现的有序队列
     */
    @Test
    public void test6() {
        SortedList theSortedList = new SortedList();

        theSortedList.insert(20);
        theSortedList.insert(40);

        theSortedList.displayList();

        theSortedList.insert(10);
        theSortedList.insert(30);
        theSortedList.insert(50);

        theSortedList.displayList();

        theSortedList.remove();

        theSortedList.displayList();
    }


    /**
     * 测试表插入排序
     */
    @Test
    public void test7() {

        int size = 10;

        Link2[] linkArray = new Link2[size];

        for(int j=0;j<size;j++) {
            int n = (int)(Math.random()*99);
            Link2 newLink = new Link2(n);
            linkArray[j]=newLink;
        }
        System.out.print("Unsorted array:");
        for(int j=0;j<size;j++) {
            System.out.print(linkArray[j].dData+" ");
        }
        System.out.println("");

        SortedList theSortedList = new SortedList(linkArray);

        for(int j=0;j<size;j++) {
            linkArray[j]=theSortedList.remove();
        }
        System.out.print("Sorted Array:  ");
        for(int j=0;j<size;j++) {
            System.out.print(linkArray[j].dData+" ");
        }
        System.out.println("");
    }

    /**
     * 测试双向链表
     */
    @Test
    public void test8() {
        DoublyLinked theList = new DoublyLinked();
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);

        theList.insertLast(11);
        theList.insertLast(33);
        theList.insertLast(55);

        theList.displayForward();
        theList.displayBackward();

        theList.deleteFirst();
        theList.deleteLast();
        theList.deleteKey(11);

        theList.displayForward();

        theList.insertAfter(22,77);
        theList.insertAfter(33,88);

        theList.displayForward();
    }





}
