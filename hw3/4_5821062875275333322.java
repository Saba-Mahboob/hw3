import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        Stack<Integer> s3 = new Stack<Integer>();

        int size, number;

        System.out.println("Enter number of numbers");
        size = in.nextInt();

        System.out.println("Enter " + size + " number");
        for (int i = 1; i <= size; i++) {

            number = in.nextInt();
            s1.push(number);

        }

        while (!s1.isEmpty()) {

            int n = s1.pop();

            while (!s2.isEmpty() && n > s2.peek()) {

                s3.push(s2.pop());

            }

            s2.push(n);

            while (!s3.isEmpty()) {

                s2.push(s3.pop());

            }

        }

        while (!s2.isEmpty()) {

            s3.push(s2.pop());

        }

    }
}
