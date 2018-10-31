package cn.andy.datastruct.link;

/**
 * @Author: zhuwei
 * @Date:2018/10/31 17:47
 * @Description: 用链表实现的栈
 */
public class LinkStack {
    private FirstLastList theList;

    public LinkStack() {
        this.theList = new FirstLastList();
    }

    public void push(long i) {
        theList.insertFirst(i);
    }

    public long pop() {
        return theList.deleteFirst();
    }

    public boolean isEmpty() {
        return (theList.isEmpty());
    }

    public void displayStack() {
        System.out.print("Stack (top-->bottom):");
        theList.displayList();
    }






}
