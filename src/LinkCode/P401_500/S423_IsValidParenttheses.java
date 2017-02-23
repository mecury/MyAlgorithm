package LinkCode.P401_500;

import java.util.Stack;

/**
 * Created by 18394 on 2017/2/23.
 */
public class S423_IsValidParenttheses {
    /**
     * @param s A string
     * @return whether the string is a valid parentheses
     */
    //LinkCode上没有通过
    public static boolean isValidParentheses(String s) {
        Stack<String> stack = new Stack<>();
        String[] strings = s.split("");
        stack.push(strings[0]);
        for (int i = 1; i < strings.length; i++) {
            String curStr = strings[i];
            String stackTop;
            if (stack.isEmpty()){
                if (curStr.equals("(")||curStr.equals("{")||curStr.equals("[")){
                    stack.push(curStr);
                } else {
                    return false;
                }
                continue;
            }else {
                stackTop = stack.peek();
            }
            if (stackTop.equals("(")) {
                if (curStr.equals(")")) {
                    stack.pop();
                } else {
                    if (curStr.equals("(")||curStr.equals("{")||curStr.equals("[")){
                        stack.push(curStr);
                    } else {
                        return false;
                    }
                }
            } else if (stackTop.equals("[")) {
                if (curStr.equals("]")) {
                    stack.pop();
                } else {
                    if (curStr.equals("(")||curStr.equals("{")||curStr.equals("[")){
                        stack.push(curStr);
                    } else {
                        return false;
                    }
                }
            } else if (stackTop.equals("{")) {
                if (stackTop.equals("}")) {
                    stack.pop();
                } else {
                    if (curStr.equals("(")||curStr.equals("{")||curStr.equals("[")){
                        stack.push(curStr);
                    } else {
                        return false;
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        System.out.println(isValidParentheses("()"));
    }
}
