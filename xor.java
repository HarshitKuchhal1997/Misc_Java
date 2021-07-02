package Practise;
import java.util.*;
import java.math.*;
public class xor {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=scan.nextInt();
        int res=arr[0];
        
        for(int i=1;i<size;i++){
            res^=arr[i];
        }
        System.out.println(res);
    }
}
