package cn.andy.datastruct.link;

/**
 * 定义两个数据域的链结点
 */
public class Link {
    public int iData;
    public double dData;
    public Link next;

    public Link(int id,double dd) {
        iData=id;
        dData =dd;
    }

    public void displayLink() {
        System.out.print("{"+iData+","+dData+"}");
    }
}
