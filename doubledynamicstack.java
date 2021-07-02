package Stack_Queues_others;

          // IF STACK IS FULL IT WILL DOUBLE THE SIZE OF ARRAY MEANS INFINITE INSERTION IN ARRAY

public class doubledynamicstack {
    
    private int data[];
    private int top;  // index of top most element of stack
    
    public doubledynamicstack(){    // Default capacity of stack
        data = new int[10];
        top = -1;
    }
    
    public doubledynamicstack(int capacity){     // User defined capacity of stack
        data = new int[capacity];
        top = -1;
    }
    
    public boolean isEmpty(){       // Check wether stack is empty or not
        return (top == -1);
    }
    
    public int size(){      // Check size of the stack
        return top + 1;
    }
    
    public void push(int element){      // Insert elements into stack
        if(size()==data.length){        
            doublecapacity();           // If stack is full then increase its capacity by doubling it
        }
        
        top++;
        data[top]=element;
    }
    
    private void doublecapacity(){      // Increase the capacity of stack if it's full
        int temp[]=data;
        data=new int[2*temp.length];
        for(int i=0;i<=top;i++){
            data[i]=temp[i];
        }
    }
    
    
    public int pop() throws StackEmptyException{        // pop elements out of stack
        if(size()==0)
        {
            StackEmptyException e=new StackEmptyException();        // Exception if stack is Empty
            throw e;
            //Exception of stack empty raised
        }

        int temp= data[top];
        top--;
        return temp;
    }
    
    public int top() throws StackEmptyException{        // returns top element of the stack
        if(size()==0){
            StackEmptyException e=new StackEmptyException();        // Exception if stack is empty
            throw e;
            //Exception of stack empty raised
        }
        return data[top];
    }
}
