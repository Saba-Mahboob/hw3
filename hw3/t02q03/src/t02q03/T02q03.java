
package t02q03;

public class T02q03 {

    public static void main(String[] args) throws Exception {
     
        String a="hello world";
        int i=0;
        Stack s1=new Stack(a.length());
        while(i<=a.length()-1){
            s1.push(a.charAt(i));
            i++;
        }
       
        while(!s1.isEmpty()){
          System.out.print(s1.pop());  
        }
        
    }
    
}
