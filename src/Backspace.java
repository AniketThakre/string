import java.util.Stack;

public class Backspace {

    public static void main(String[] args) {
        String s = "y#fo##f";
        String t = "y#f#o##f";
        System.out.println(backspaceCompare(s,t));
    }
    public static boolean backspaceCompare(String s, String t) {
        s = applyBackspace(s);
        t = applyBackspace(t);
        if(s.equals(t)){
            return true;
        }
        return false;
    }

    public static String applyBackspace(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#' && stack.size()!=0){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(stack.size()>0){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
