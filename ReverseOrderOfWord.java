import java.util.*;
// Input: s = "i.like.this.program.very.much"
// Output: much.very.program.this.like.i


public class ReverseOrderOfWord {
    public static void main(String[] args) {
        String s="i.like.this.program.very.much";
        String result=reverse(s);
        System.out.println(result);
    }
    public static String reverse(String s){
        Stack<String> stack=new Stack<>();
        StringBuilder word=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='.'){
                word.append(s.charAt(i));
            } else if (word.length()>0) {
                stack.push(word.toString());
                word.setLength(0);
            }
        }
        if(word.length()>0)
            stack.push(word.toString());

        StringBuilder result=new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pop());
            if(!stack.isEmpty())
                result.append('.');
        }
        return result.toString();
    }
}
