package cn.andy.datastruct.link;

/**
 * @Author: zhuwei
 * @Date:2018/10/31 17:55
 * @Description: 用链表实现的队列
 */
public class LinkQueue {
    private FirstLastList theList;

    public LinkQueue(){
        theList = new FirstLastList();
    }

    public boolean isEmpty() {
        return theList.isEmpty();
    }

    public void insert(long j) {
        theList.insertLast(j);
    }

    public long remove() {
        return theList.deleteFirst();
    }

    public void displayQueue() {
        theList.displayList();
    }




















    
}
