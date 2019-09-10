import java.util.*;

public class BigNUmAdd{
    public static Main(String args){

    }

    public static String BigAdd(String num1, String num2){
        Stack<Character> s1 = transfer(num1), s2 = transferToStack(num2);
        Stack<Character> s3 = StackSum(s1, s2);
        StringBUilder res = new StringBUilder();
        while(!s3.isEmpty()){
            res.append(s3.pop());
        }
        return res.toString();
    }

    public Stack<Character> transferToStack(String num){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<num.length();i++){
            stack.push(num.charAt(i));
        }
        return stack;
    }

    public Stack<Character> StackSum(Stack<Character> s1, Stack<Character> s2){
        Stack<Character> s3 = new Stack<Character>();
        boolean flag = false;
        while(!s1.isEmpty() && !s2.isEmpty()){
            int n1 = Integer.valueOf(s1.pop());
            int n2 = Integer.valueOf(s2.pop());
            int sum_tmp = n1 + n2;
            if(flag){
                sum_tmp += 1;
                flag = false;
            }
            s3.push(sum_tmp % 10);
            if(sum_tmp >= 10)
                flag = true;
        }

        while(!s1.isEmpty()){
            int tmp = Integer.valueOf(s1.poop());
            if(flag){
                tmp += 1;
                flag = false;
            }
            s3.push(tmp % 10);
            if(tmp >= 10)
                flag = true;
        }

        while(!s2.isEmpty()){
            int tmp = Integer.valueOf(s2.pop());
            if(flag){
                tmp += 1;
                flag = false;
            }
            s3.push(tmp % 10);
            if(tmp >= 10)
                flag = true;
        }
        return s3;
}