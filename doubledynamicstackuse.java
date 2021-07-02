package Stack_Queues_others;
import java.util.*;
public class doubledynamicstackuse {
    public static void main(String[] args)  throws StackEmptyException{
        Scanner scan=new Scanner(System.in);
        int sc=scan.nextInt();
        doubledynamicstack s=new doubledynamicstack();
        for(int i=1;i<=sc;i++){
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
