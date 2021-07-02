package Practise;
import java.util.*;
public class dublicateinarray {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int[] arr=new int[size];
        
        int sum=0,sum1=0,res;
        for(int i=0;i<size;i++)
            arr[i]=scan.nextInt();
        for(int i=0;i<size;i++)
            sum+=arr[i];
        if(arr[0]!=0){
            for(int i=0;i<size-1;i++)
                sum1+=arr[i];
        }
        else{
            for(int i=1;i<size-1;i++)
                sum1+=arr[i];
        }
        res=sum-sum1;
        System.out.println(res);
    }
}
