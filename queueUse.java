package Stack_Queues_others;

public class queueUse {
    public static void main(String[] args){
        
        queueusingLL<Integer> queue=new queueusingLL<>();
        
        for(int i=1;i<=5;i++){
            queue.enqueue(i);
        }
        while(!queue.isEmpty()){
            try{
                System.out.println(queue.dequeue());
            }catch(QueueEmptyException e){
                e.printStackTrace();
            }
        }
    }
}
