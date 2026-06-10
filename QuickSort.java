public class QuickSort{
    static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pividx=partition(arr,low,high);
            quickSort(arr,low,pividx-1);
            quickSort(arr,pividx+1,high);
        }
    }
    static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                int temp=arr[i+1];
                arr[i+1]=arr[j];
                arr[j]=temp;
                i++;
            }
            
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void main(String[] args){
        int[] arr={7,3,6,5,1,9,10};
        int n=arr.length;   
        quickSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}