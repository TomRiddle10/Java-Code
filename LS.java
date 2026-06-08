import java.util.*;
public class LS{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[120];
        int n;
        int ln,sn;
        System.out.println("Enter size of array:");
        n=sc.nextInt();
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        sn=arr[0];
        ln=arr[0];
        int i=0;
        while(i<n){
            if(arr[i]>ln){
                ln=arr[i];
            }
            if(arr[i]<sn){
                sn=arr[i];
            }
            i++;
        }
        
        System.out.println("Largest element: "+ln+" at index "+arr[ln]);
        System.out.println("Smallest element: "+sn+" at index "+arr[sn]);
    }
}