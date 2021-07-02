package Stack_Queues_others;
import java.util.*;
public class arrayintersection {
    public static void main(String[] args){
        
        int i=0,j=0;
        int[] arr1={1,2,3,4,5};
        int[] arr2={2,4,6,7,8};
        int m=arr1.length;
        int n=arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while(i<m && j<n)
        {
            if(arr1[i]==arr2[j])
            {
                System.out.print(arr1[i]+" ");
				i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
    }
}
