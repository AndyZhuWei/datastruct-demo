package cn.andy.datastruct.array;

import cn.andy.datastruct.DemoApplicationTests;
import org.junit.Test;

/**
 * @Author: zhuwei
 * @Date:2018/10/29 11:43
 * @Description: 数组相关的测试
 */
public class ArrayTests extends DemoApplicationTests {

    @Test
    public void test() {
        LowArray arr;
        arr = new LowArray(100);
        int nElems = 0;
        int j;

        //对数组进行赋值
        arr.setElem(0,77);
        arr.setElem(1,99);
        arr.setElem(2,44);
        arr.setElem(3,55);
        arr.setElem(4,22);
        arr.setElem(5,88);
        arr.setElem(6,11);
        arr.setElem(7,00);
        arr.setElem(8,66);
        arr.setElem(9,33);

        //输出数组前10个元素
        nElems = 10;
        for(j=0;j<nElems;j++) {
            System.out.print(arr.getElem(j)+" ");
        }
        System.out.println("");
        // search for data item
        int searchKey = 26;
        for(j=0;j<nElems;j++) {
            if(arr.getElem(j) == searchKey) {
                break;
            }
        }
        if(j == nElems) {
            System.out.println("Can't find "+ searchKey);
        } else {
            System.out.println("Found "+searchKey);
        }

        //delete value 55
        for(j=0;j<nElems;j++) {
            if(arr.getElem(j) == 55) {
                break;
            }
        }
        for(int k=j;k<nElems;k++) {
            arr.setElem(k,arr.getElem(k+1));
        }
        nElems--;

        for(j=0;j<nElems;j++) {
            System.out.print(arr.getElem(j) + " ");
        }
        System.out.println("");
    }

    @Test
    public void test2() {
        int maxSize = 100;
        OrderedArray arr;
        arr = new OrderedArray(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        int searchKey = 55;
        if(arr.find(searchKey) != arr.size()) {
            System.out.println("Found "+searchKey);
        } else {
            System.out.println("Can't find " + searchKey);
        }

        arr.display();

        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        arr.display();


    }
}
