  public class Solution
  {
    public int calculate(String s)
    {
      Stack<Integer> stk_val = new Stack<Integer>();
      Stack<Character> stk_op = new Stack<Character>();
      int res = 0, tmp;

      for (int i = 0; i <= s.length(); ++i)
      {
        if (i < s.length() && Character.isDigit(s.charAt(i)))
        {
          res = 0;

          while (i < s.length() && Character.isDigit(s.charAt(i)))
          {
            res *= 10;
            res += s.charAt(i++ ) - '0';
          }

          stk_val.push(res);
        }

        if (i == s.length() || s.charAt(i) == '+' || s.charAt(i) == '-'
            || s.charAt(i) == '*' || s.charAt(i) == '/' || s.charAt(i) == ')')
        {
          while (!stk_op.empty() && stk_op.peek() != '('
                 && (i == s.length() || isOK(stk_op.peek(), s.charAt(i))))
          {
            tmp = stk_val.peek();
            stk_val.pop();
            stk_val.push(calc(stk_val.peek(), tmp, stk_op.peek()));
            stk_op.pop();
          }

          if (i == s.length())
          {
            break;
          }
          else if (s.charAt(i) == ')')
          {
            stk_op.pop();
          }
          else
          {
            stk_op.push(s.charAt(i));
          }
        }
        else if (s.charAt(i) == '(')
        {
          stk_op.push(s.charAt(i));
        }
      }

      return stk_val.peek();
    }

    private Integer calc(int a, int b, char op)
    {
      if (op == '+') { return a + b; }
      else if (op == '-') { return a - b; }
      else if (op == '*') { return a * b; }
      else { return a / b; }
    }

    private boolean isOK(char op1, char op2)
    {
      if (op1 == '*' || op1 == '/' || op2 == ')') { return true; }
      else { return op2 == '+' || op2 == '-'; }
    }
  }

