package cn.andy.datastruct.StackX;

/**
 * @Author: zhuwei
 * @Date:2018/10/30 17:12
 * @Description: 运行后缀表示法进行计算
 * 计算规则：
 * 从左到右进行遍历，如果是数字则入栈，
 * 如果是操作符号，则出栈两个元素，用符号进行计算 ，最后入栈
 * 遍历完成后，栈中的唯一元素就是结果
 */
public class Cal {

    private  String lastEL;

    private StackX stackX = null;

   public Cal(String lastEL) {
       this.lastEL = lastEL;
   }

    public long getResult() {
        int length = lastEL.length();
        stackX = new StackX(length);
        for (int i = 0; i < length; i++) {
            char c = lastEL.charAt(i);
            if (c >= 48 && c <= 57) {//数字
                stackX.push(Character.getNumericValue(c));
            } else {//符号
                long c1 = stackX.pop();
                long c2 = stackX.pop();
                int result;
                switch (c) {
                    case '+':
                        stackX.push(c1+c2);
                        break;
                    case '-':
                        stackX.push(c2-c1);
                        break;
                    case '*':
                        stackX.push(c1*c2);
                        break;
                    case '/':
                        stackX.push(c2/c1);
                        break;
                    default:
                }

            }
        }
        return stackX.pop();
    }
}
