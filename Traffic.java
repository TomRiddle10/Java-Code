import java.util.*;

public class Traffic {
    public static void main(String[] args) {
        int[] arr = { -2, -1, -3, 4, -1, 2, 1, -5, 4 };
        int k = 7;
        int sum = 0;
        int count = 0;
        int max= 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
                if(!map.containsKey(sum)) {
                    map.put(sum, i);
                }
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        

        System.out.println(max);
    } 
        
}


    