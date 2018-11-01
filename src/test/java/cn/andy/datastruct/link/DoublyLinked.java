package cn.andy.datastruct.link;

/**
 * 双向链表
 */
public class DoublyLinked {
    private Link3 first;
    private Link3 last;

    public DoublyLinked(){
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long dd) {
        Link3 newLink = new Link3(dd);
        if(isEmpty()) {
            last = newLink;
        } else {
            first.previous=newLink;
        }
        newLink.next=first;
        first=newLink;
    }

    public void insertLast(long dd) {
        Link3 newLink = new Link3(dd);
        if(isEmpty()){
            first=newLink;
        } else {
            last.next=newLink;
            newLink.previous=last;
        }
        last=newLink;
    }

    public Link3 deleteFirst() {
        Link3 temp = first;
        if(first.next==null) {
            last = null;
        } else {
            first.next.previous=null;
        }
        first=first.next;
        return temp;
    }

    public Link3 deleteLast() {
        Link3 temp = last;
        if(first.next==null) {
            first=null;
        } else {
            last.previous.next=null;
        }
        last=last.previous;
        return temp;
    }

    public boolean insertAfter(long key,long dd) {
        Link3 current = first;
        while(current.dData!=key) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }
        Link3 newLink = new Link3(dd);
        if(current==last){
            newLink.next=null;
            last=newLink;
        } else {
            newLink.next=current.next;
            current.next.previous=newLink;
        }
        newLink.previous=current;
        current.next=newLink;
        return true;
    }

    public Link3 deleteKey(long key) {
        Link3 current = first;
        while(current.dData!=key) {
            current=current.next;
            if(current==null){
                return null;
            }
        }
        if(current==first){
            first = current.next;
        } else {
            current.previous.next=current.next;
        }
        if(current==last) {
            last = current.previous;
        } else {
            current.next.previous=current.previous;
        }
        return current;
    }

    public void displayForward() {
        System.out.print("List (first-->last): ");
        Link3 current = first;
        while (current!=null){
            current.displayLink();
            current=current.next;
        }
        System.out.println("");
    }

    public void displayBackward() {
        System.out.print("List (last-->first): ");
        Link3 current = last;
        while(current!=null) {
            current.displayLink();
            current=current.previous;
        }
        System.out.println("");
    }






}
