package t02q12;

import static java.lang.Math.pow;

public class T02q12 {

    public static void main(String[] args) throws Exception {
        String a = "24+46+*";
        int n1, n2;
        Stack s = new Stack(a.length());
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) <= 57 && a.charAt(i)>= 48) 
                s.push((int)a.charAt(i)-'0');
            else if(){
    
            n2 = (int) s.pop();
            n1 = (int) s.pop();
            switch (a.charAt(i)) {
                case '+':
                    s.push(n1 + n2);
                    break;
                case '-':
                    s.push(n1 - n2);
                    break;
                case '*':
                    s.push(n1 * n2);
                    break;
                case '/':
                    s.push(n1 / n2);
                    break;
                case '^':
                    s.push(pow(n1, n2));
                    break;

            }

        }}
        System.out.println(s.pop());

    }

}
