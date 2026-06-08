import java.util.*;

public class LongestSubR {
    public static void main(String[] args) {
        int arr[] = new int[] { 3, -2, 5, -1, 2, -3, 6, -2, 4 };
        int k = 7;
        int sum = 0;
        int max= 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                int len=i-map.get(sum-k);
                max=max<len?len:max;
            }
                if(!map.containsKey(sum)) {
                    map.put(sum, i);
                }
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        

        System.out.println(max);
    } 

    }
