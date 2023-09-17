public class parantheses{
    
   public static boolean isValid(String s) {
                int p = 0, sb = 0, cb = 0;

                for (char c : s.toCharArray()) {
                    if (c == '(')
                        p++;
                    else if (c == '[')
                        sb++;
                    else if (c == '{')
                        cb++;
                    else if (c == ')') {
                        if (p == 0) return false;
                        p--;
                    } else if (c == ']') {
                        if (sb == 0) return false;
                        sb--;
                    } else if (c == '}') {
                        if (cb == 0) return false;
                        cb--;
                    }
                }
                return p == 0 && sb == 0 && cb == 0;
            }
        
    }
