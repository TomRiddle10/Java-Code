import java.util.*;
public class LinearSearch {
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
        int key;
        System.out.println("Enter a number to search");
        key=sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]==key){
                System.out.println("Element"+key+" found at index: " + (i+1));
                return;
            }
        }
        System.out.println("Element not found");
    }
}
