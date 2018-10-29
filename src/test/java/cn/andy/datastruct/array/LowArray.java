package cn.andy.datastruct.array;

/**
 * @Author: zhuwei
 * @Date:2018/10/29 11:46
 * @Description:
 */
public class LowArray {
    //声明一个long基本类型的数组
    private long[] a;

    //通过带有数组大小的构造函数还初始化数组
    public LowArray(int size) {
        a = new long[size];
    }

    //对数组下标index进行赋值操作
    public void setElem(int index,long value) {
        a[index] = value;
    }

    //通过数组下标得到指定的值
    public long getElem(int index) {
        return a[index];
    }
}
