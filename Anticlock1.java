import java.util.*;
public class Anticlock1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter a Size of array");
        size=sc.nextInt();
        int[] arr=new int[10];
        System.out.println("Enter element of array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a number of times to rotate");
        int k=sc.nextInt();
        System.out.println("Array elements fix after rotation");
        int m=sc.nextInt();
        for(int i=0;i<k;i++){
            int temp=arr[size-1-m];
            for(int j=size-2-m;j>=0;j--){
                arr[j+1]=arr[j];
            }
            arr[0]=temp;
        }

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}