package cn.andy.datastruct.StackX;

/**
 * @Author: zhuwei
 * @Date:2018/10/30 17:09
 * @Description: 四则运算
 */
public class FourOperations {

    public String el;

    private RPN rpn;

    private Cal cal;

    public FourOperations(String string) {
        this.el = string;
        this.rpn = new RPN(el);
        this.cal = new Cal(this.rpn.getLastEL());
    }

    public long getResult() {
        return cal.getResult();
    }


}
