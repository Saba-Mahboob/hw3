
package t02q10;

public class T02q10 {
    
    public static void main(String[] args) {
        Queue q1=new Queue(5);
        Queue q2=new Queue(5);
        Queue q3=new Queue(5);
        q1.enQueue(1);
        q1.enQueue(2);
        q1.enQueue(3);
        q1.enQueue(4);
        
        
        int i=0;
        while(i<=(q1.size()-1)/2){
            Object o=q1.deQueue();
            q2.enQueue(o);
            i++;
            
        }
        while(!(q1.isEmpty()||q2.isEmpty())){
             Object o=q2.deQueue();
             q3.enQueue(o);
              Object m=q1.deQueue();
              q3.enQueue(m);
        }
        while(!q3.isEmpty()){
        System.out.print(q3.deQueue());
    }
        
        
    }
    
}
