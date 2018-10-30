package cn.andy.datastruct.StackX;

/**
 * @Author: zhuwei
 * @Date:2018/10/30 10:41
 * @Description:
 */
public class BracketChecker {
    public String inputStr;

    public BracketChecker(String str) {
        this.inputStr = str;
    }

    public void check() {
        int index=0;
        int length = this.inputStr.length();
        StackChar stackChar = new StackChar(length);
        while(index<length) {
            char c = this.inputStr.charAt(index);
            switch (c) {
                case '{':
                case '[':
                case '(':
                    stackChar.push(c);
                    break;
                case '}':
                case ']':
                case ')':
                    if(!stackChar.isEmpty()) {
                        char c1 = stackChar.pop();
                        if(c1 != c) {
                            System.out.println("Error :"+c+" at "+index);
                        }
                    } else {
                        System.out.println("Error :"+c+" at "+index);
                    }
                    break;
                default:
                    break;
            }
        }
        if(!stackChar.isEmpty()) {
            System.out.println("Error:Missing right delimiter");
        }
    }
}
