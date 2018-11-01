package cn.andy.datastruct.link;

public class SortedList {
    private Link2 first;

    public SortedList() {
        first = null;
    }

    public SortedList(Link2[] linkArr) {
        first = null;
        for(int j=0;j<linkArr.length;j++) {
            insert(linkArr[j]);
        }
    }

    public boolean isEmpty() {
        return (first==null);
    }
    public void insert(Link2 link2) {
        Link2 prvious = null;
        Link2 current = first;
        while (current!=null&&link2.dData>current.dData){
            prvious = current;
            current=current.next;
        }
        if(prvious==null){
            first=link2;
        } else {
            prvious.next=link2;
        }
        link2.next=current;

    }

    public void insert(long key) {
        Link2 newLink = new Link2(key);
        Link2 previous = null;
        Link2 current = first;

        while(current!=null&&key>current.dData) {
            previous = current;
            current = current.next;
        }
        if(previous==null){
            first = newLink;
        } else {
            previous.next=newLink;
        }
        newLink.next=current;
    }

    public Link2 remove() {
        Link2 temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link2 current = first;
        while (current!=null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }



















}
