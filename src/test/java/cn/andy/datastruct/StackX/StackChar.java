package cn.andy.datastruct.StackX;

/**
 * @Author: zhuwei
 * @Date:2018/10/30 9:57
 * @Description:
 */
public class StackChar {
    private int maxSize; //size of stack array

    private char[] stackArray;

    private int top; //top of stack

    //constructor
    public StackChar(int s) {
        maxSize = s;       //set array size
        stackArray = new char[maxSize]; //create array
        top = -1; //no item yet
    }

    public void push(char i) { //put item on top of stack
        stackArray[++top] = i; //increment top,insert item
    }

    public char pop() {///take item from top of stack
        return stackArray[top--];
    }

    public char peek() {//peek at top of stack
        return stackArray[top];
    }

    public boolean isEmpty() {//true if stack is empty
        return (top == -1);
    }

    public boolean isFull() { //true if stack is full
        return (top == maxSize-1);
    }


}
