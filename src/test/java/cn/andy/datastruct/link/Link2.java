package cn.andy.datastruct.link;

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
