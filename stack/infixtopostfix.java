
package stack;
import java.util.Stack;
public class infixtopostfix {
    public int prec(Character ch)
    {
        switch(ch)
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    public String infixtopostfix(String exp)
    {
        String result=new String("");
        Stack<Character> st=new Stack<>();
        for(int i=0;i<exp.length();i++)
        {
            char ch=exp.charAt(i);
            if(Character.isLetterOrDigit(ch))
                result=result+ch;
            else if(ch=='(')
                st.push(ch);
            else if(ch==')')
            {
                while(!st.isEmpty()&&st.peek()!='(')
                    result=result+st.pop();
                if(!st.isEmpty()&&st.peek()!='(')
                    return "Invalid Expression";
                else
                    st.pop();
            }
            else
            {
                while(!st.isEmpty()&&prec(ch)<=prec(st.peek()))
                    result=result+st.pop();
                    st.push(ch);
            }
            
        }
        while(!st.isEmpty())
            result=result+st.pop();
        return result;
    }
  public static void main(String args[])
  {
      infixtopostfix ip=new infixtopostfix();
      String exp1="a+b";
      String exp2="a+b*(c^d-e)^(f+g*h)-i";
      String exp3="1+2+5*6+@";
      String exp4="((a+s+d)";
      String exp5="((a+s+d))";
      String infixtopostfix1 = ip.infixtopostfix(exp1);
      String infixtopostfix2= ip.infixtopostfix(exp2);
      String infixtopostfix3 = ip.infixtopostfix(exp3);
      String infixtopostfix4 = ip.infixtopostfix(exp4);
      String infixtopostfix5 = ip.infixtopostfix(exp5);
      System.out.println(infixtopostfix1);
      System.out.println(infixtopostfix2);
      System.out.println(infixtopostfix3);
      System.out.println(infixtopostfix4);
      System.out.println(infixtopostfix5);
  }
}
