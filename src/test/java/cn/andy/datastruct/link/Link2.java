package cn.andy.datastruct.link;


/**
 * 定义一个数据域的链结点
 */
public class Link2 {
    public long dData;
    public Link2 next;

    public Link2(long dd) {
        dData =dd;
    }

    public void displayLink() {
        System.out.print("{"+dData+"}");
    }
}
