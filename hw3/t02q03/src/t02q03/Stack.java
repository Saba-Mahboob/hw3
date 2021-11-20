/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02q03;

/**
 *
 * @author Emertat
 */
public class Stack {
      private final static int DEFAULT_CAPACITY = 100;
    private Object [] stack ;
    private int top ;


    public Stack(){
        stack = new Object[DEFAULT_CAPACITY];
        top = -1;
    }

    public Stack(int capacity) throws Exception{
        if(capacity < 1){
            throw new Exception("Capacity must be > 0");
        }
        stack = new Object[capacity];
        top = -1;
    }

    public int size() {
        return top + 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return size() == stack.length;
    }

    public void push(Object item) {
        if (item == null) {
            throw new IllegalArgumentException("Item is null");
        }
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        top = top + 1;
        stack[top] = item;
    }
     public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        Object topItem = stack[top];
        stack[top] = null;
        top = top - 1;
        return topItem;
    }
     
        
   

}
