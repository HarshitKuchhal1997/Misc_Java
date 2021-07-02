package Stack_Queues_others;
import java.util.*;
public class stackuse {
    public static void main(String[] args) throws StackFullException,StackEmptyException{
        stack s=new stack();
        for(int i=1;i<=5;i++){
            s.push(i);
        }
        System.out.println("Size of stack: "+s.size());
        /*while(!s.isEmpty()){
            try{
                System.out.println(s.pop());
            }
            catch(StackEmptyException e){
                
            }
        }*/
        while(!s.isEmpty())
            System.out.println(s.pop());
    }
}
