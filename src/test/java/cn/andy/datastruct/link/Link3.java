package cn.andy.datastruct.link;


/**
 * 定义一个数据域的链结点
 */
public class Link3 {
    public long dData;
    public Link3 next;
    public Link3 previous;

    public Link3(long dd) {
        dData =dd;
    }

    public void displayLink() {
        System.out.print("{"+dData+"}");
    }
}
