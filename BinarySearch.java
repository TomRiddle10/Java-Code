import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter size of element");
        size=sc.nextInt();
        int[] arr=new int[10];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int key;
        System.out.println("Enter a element to search");
        key=sc.nextInt();
        int low=0,high=size-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                System.out.println("Element"+key+" found at index: " + (mid+1));
                return;
            }else if(arr[mid]>key){
                high=mid-1;
            }else if(arr[mid]<key){
                low=mid+1;
            }else {
                System.out.println("Element not found");
            }
        }
    }
}
