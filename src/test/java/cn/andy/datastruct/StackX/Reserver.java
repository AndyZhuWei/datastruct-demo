package cn.andy.datastruct.StackX;

/**
 * @Author: zhuwei
 * @Date:2018/10/30 10:19
 * @Description: 倒序输入的字符数据
 */
public class Reserver {
    private String inputStr;

    private String outStr;

    private StackChar stackChar;

    public Reserver(String str) {
        this.inputStr = str;
    }

    public String doReserver() {
        int index = 0;
        int length = this.inputStr.length();
        stackChar = new StackChar(length);
        while (index < length) {
            stackChar.push(inputStr.charAt(index));
            index++;
        }
        char[] newChar = new char[length];
        index = 0;
        while(!stackChar.isEmpty()) {
            newChar[index++]=stackChar.pop();
        }

        outStr =  new String(newChar);
        return outStr;
    }
}
