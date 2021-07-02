package Stack_Queues_others;
import java.util.*;
public class sumofarrayrecursion {
    public static int sum(int input[]) {
    if(input.length<=0){
        return 0;
    }    
    System.out.println("Done");
    int[] smallAns=new int[input.length - 1];
    for(int i=0;i<input.length;i++){
        smallAns[i]+=input[i]+input[i+1];
    }
    System.out.println("Done2");
    return smallAns[0];
}
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int input[] = new int[n];
	for(int i = 0; i < n; i++) {
            input[i] = s.nextInt();
	}
	System.out.println(sum(input));
    }
}