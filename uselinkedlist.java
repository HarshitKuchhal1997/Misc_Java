package Stack_Queues_others;
import java.util.*;
public class uselinkedlist {
    public static void main(String[] args){
        linkedlist<Integer> l=new linkedlist<Integer>(20);
        System.out.println(l.data);
        System.out.println(l.next);
        linkedlist<Integer> l2=new linkedlist<Integer>(10);
        System.out.println(l2.data);
        System.out.println(l2.next);
        l.next=l2;
        System.out.println(l2);
        System.out.println(l.next);
        System.out.println(l.data);
    }
}
