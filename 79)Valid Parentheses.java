//LEETCODE
class Solution {
    public boolean isMatching(char a,char b){
        return (a==')' && b=='(') ||
            (a==']' && b=='[')||
            (a=='}' && b=='{');
            
    }
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' ||ch=='{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else if(!isMatching(ch,st.peek())){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }
}

//CODE STUDIO
import java.util.*;
public class Solution {
    public static boolean isValidParenthesis(String expression) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<expression.length();i++){
            char c=expression.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }
            else{
                if(st.isEmpty()) return false;
                else if(!isMatching(c,st.peek())) return false;
                else st.pop();
            }
        }
        return st.isEmpty();
    }

    public static boolean isMatching(char a,char b){
        return (a==')' && b=='(') || (a=='}' && b=='{') || (a==']' && b=='[');
    }

}
