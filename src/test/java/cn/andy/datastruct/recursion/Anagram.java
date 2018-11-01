package cn.andy.datastruct.recursion;

/**
 * @Author: zhuwei
 * @Date:2018/11/1 15:04
 * @Description:
 */
public class Anagram {

    private static int size;

    private static int count = 0;

    private static char[] arrChar = new char[100];

    public Anagram(String word) {
        size = word.length();
        for(int j=0;j<size;j++){
            arrChar[j]=word.charAt(j);
        }
    }

    public void anagram() {
        doAnagram(size);
    }

    public void  doAnagram(int newSize) {
        if(newSize == 1) {
            return;
        }
        for(int j=0;j<newSize;j++) {
            doAnagram(newSize-1);
            if(newSize==2) {
                displayWord();
            }
            rotate(newSize);
        }
    }

    public static void rotate(int newSize) {
        int j;
        int position = size-newSize;
        char temp = arrChar[position];
        for(j=position+1;j<size;j++) {
            arrChar[j-1]=arrChar[j];
        }
        arrChar[j-1]=temp;
    }

    public static void displayWord() {
        if(count<99) {
            System.out.print(" ");
        }
        if(count < 9) {
            System.out.print(" ");
        }
        System.out.print(++count + " ");
        for(int j=0;j<size;j++) {
            System.out.print(arrChar[j]);
        }
        System.out.print(" ");
        System.out.flush();
        if(count%6==0){
            System.out.println("");
        }
    }
}
