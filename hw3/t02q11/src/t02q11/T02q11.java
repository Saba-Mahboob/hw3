package t02q11;

public class T02q11 {

    public static void main(String[] args) throws Exception {
        int a[] = {5, 3, 1, 4, 2};
        Stack s1 = new Stack(a.length);
        Stack s2 = new Stack();
        

        for (int i = 0; i < a.length; i++) {
            s1.push(a[i]);
        }
        while (!s1.isEmpty()) {
            int n = (int) s1.pop();
            if(s2.size()!=0||s2.peek()!=null){
                while ((int) s2.peek() <n) {
                    s1.push(s2.pop());
                }
            }
            else
                s2.push(n);
                
               
            
        }

        while (!s2.isEmpty()) {
            System.out.println(s2.pop());

        }
    }
}
