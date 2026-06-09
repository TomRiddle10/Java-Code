// ar[1,3,2,4,2]
// you need to find cycle and starting of cycle
public class Cycle{
    public static void main(String[] args){
        int[] arr={1,3,2,4,2};
        int slow=0,fast=0;
        slow=arr[slow];
        while(slow!=fast|| slow==0){
            slow=arr[slow];
            fast=arr[arr[fast]];
        }
        if(slow==fast){
            System.out.print("Cycle found at index "+slow);
        }else{
            System.out.print("No cycle found");
        }
    }
}