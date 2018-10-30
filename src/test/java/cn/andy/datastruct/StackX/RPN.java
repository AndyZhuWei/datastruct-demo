package cn.andy.datastruct.StackX;

import cn.andy.datastruct.StackX.StackChar;

/**
 * @Author: zhuwei
 * @Date:2018/10/30 15:39
 * @Description: 后缀表达式
 * 中缀表达式转换成后缀表达式的规则：
 * 从左到右读取表达式的字符，如果遇到数字，则直接输出到后缀表达式中，
 * 如果遇到是右括号，则匹配栈中的左括号，期间输出左括号之上的所有符号
 * 如果遇到是操作符号，则依次和栈顶元素优先级进行比较，
 * 如果大于，则进行入栈，否则输出栈顶元素到后缀表达式中。
 */
public class RPN {

    private String inputStr;

    private String outStr;

    public RPN(String str) {
        this.inputStr = str;
    }


    //显示后缀表达式
    public String getLastEL() {
        int length = inputStr.length();
        StackChar stackChar = new StackChar(length);
        StringBuffer returnStr = new StringBuffer();
        for(int i=0;i<length;i++) {
            char c = inputStr.charAt(i);
            if(c>=48 && c<=57) {//是数字
                returnStr.append(c);
            } else {//操作符号
                char popC;
                if(!stackChar.isEmpty()) {
                    if(c == ')') {//输出栈中匹配的右括号以上的符号
                        while(!stackChar.isEmpty()&&(popC=stackChar.pop())!='(') {
                            if (popC == '(') {
                                continue;
                            }
                            returnStr.append(popC);
                        }
                    } else if(c =='('){
                        stackChar.push(c);
                    } else if(c == '+' || c == '-') {
                        popC = stackChar.peek();
                        while(!stackChar.isEmpty()&&popC!='(') {
                            popC = stackChar.pop();
                            if (popC == '(') {
                                continue;
                            }
                            returnStr.append(popC);
                        }
                        stackChar.push(c);
                    } else if((c == '*' || c =='/')) {
                        popC = stackChar.peek();
                        if(popC == '+' || popC =='-' || popC=='(') {
                            stackChar.push(c);
                        } else {
                            while(!stackChar.isEmpty()&&((popC=stackChar.pop())=='*'||(popC=stackChar.pop())=='/')) {
                                returnStr.append(popC);
                            }
                            stackChar.push(c);
                        }
                    }

                } else {
                    stackChar.push(c);
                }
            }
        }
        while(!stackChar.isEmpty()) {
            returnStr.append(stackChar.pop());
        }
        return returnStr.toString();
    }
}
