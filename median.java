package Practise;
import java.util.*;
import java.util.Arrays;
import java.math.*;

public class median {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int a=(arr.length)/2;
        System.out.println(arr[a]);
    }
}