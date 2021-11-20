import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Stack<Character> stk = new Stack<Character>();
        String s;
        int count = 0;

        System.out.println("Enter string");
        s = in.nextLine();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {

                stk.push(s.charAt(i));

            } else {

                if (stk.isEmpty())
                    count++;
                else
                    stk.pop();

            }

        }

        count += stk.size();

        System.out.println(count);

    }
}
