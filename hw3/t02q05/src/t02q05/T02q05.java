
package t02q05;

public class T02q05 {

   
    public static void main(String[] args) throws Exception {
        String a="((ds981((ilam university))))(((((((((data structure)))";
        Stack s= new Stack(a.length());
        int k=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='(')
                s.push(a.charAt(i));
                else if (a.charAt(i)==')'&&!s.isEmpty()){
                       char ch=(char)s.pop();
                       if(ch=='('&&a.charAt(i)==')')
                        k++;
                      
        }

    }
        System.out.println(k);
    
}
}
