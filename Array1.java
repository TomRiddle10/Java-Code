import java.util.*;
public class Array1 {
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
        int a;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    a=arr[i];
                    arr[i]=arr[j];
                    arr[j]=a;
                }
            }
        }
        System.out.println("Second largest number:"+arr[1]);
        System.out.println("Third smallest number:"+arr[size-3]);
    }
}
