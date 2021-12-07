import java.util.*;

public class Infix_Postfix {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String expression = sc.nextLine().trim();
        System.out.println(infixTopostfix("a+b-c+d*(e-f)/g+(h*(i/j))"));
    }

    public static String infixTopostfix(String str) {
        Stack<Character> st = new Stack<>();
        char[] ch = str.toCharArray();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < ch.length; i++) {
//            System.out.println(st);
            if (bodmas(ch[i]) > 0) {
                while (!st.isEmpty() && bodmas(st.peek()) >= bodmas(ch[i])) {
                    res.append(st.pop());
                }
                st.push(ch[i]);
            } else if (ch[i] == ')') {
                char c = st.pop();
                while (c != '(') {
                    res.append(c);
                    c = st.pop();
                }
            } else if (ch[i] == '(') {
                st.push(ch[i]);
            } else {
                res.append(ch[i]);
            }
        }
//        System.out.println(st);
        for (int i = 0; i < st.size(); i++) {
            res.append(st.pop());
        }
        return res.toString();
    }

    public static int bodmas(char ch) {
        if (ch == '+' || ch == '-') return 1;
        else if (ch == '*' || ch == '/') return 2;
        else if (ch == '^') return 3;
        else return -1;
    }
}