package Stack_Queues_others;

           // IF STACK IS FULL IT WILL THROW AN ERROR MEANS FINITE INSERTION IN ARRAY

public class stack{
    
    private int data[];
    private int top;  // index of top most element of stack
    
    public stack(){
        data = new int[10];
        top = -1;
    }
    
    public stack(int capacity){
        data = new int[capacity];
        top = -1;
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
    
    public int size(){
        return top + 1;
    }
    
    public void push(int element) throws StackFullException{
        if(size()==data.length){ 
            StackFullException e=new StackFullException();
            throw e;
            //stack full exception raised
        }
        
        top++;
        data[top]=element;
    }
    
    public int pop() throws StackEmptyException{
        if(size()==0)
        {
            StackEmptyException e=new StackEmptyException();
            throw e;
            //Exception of stack empty raised
        }

        int temp= data[top];
        top--;
        return temp;
    }
    
    public int top() throws StackEmptyException{
        if(size()==0){
            StackEmptyException e=new StackEmptyException();
            throw e;
            //Exception of stack empty raised
        }
        return data[top];
    }   
}

class StackEmptyException extends Exception{
    
}

class StackFullException extends Exception{
    
}

