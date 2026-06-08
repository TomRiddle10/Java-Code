public class minmax {
    public static void main(String[] args){
        int[] arr={5, 2, 8, 1, 9};
        int max=arr[0],smax=arr[0];
        int min=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        int tmin=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        if(arr[arr.length-1]<min){
            tmin=smin;
            smin=min;
            min=arr[arr.length-1];
        }else if(arr[arr.length-1]<smin){
            tmin=smin;
            smin=arr[arr.length-1];
        }else if(arr[arr.length-1]<tmin){
            tmin=arr[arr.length-1];
        }
    }
}

