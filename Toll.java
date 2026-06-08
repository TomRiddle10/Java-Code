public class Toll {
    public static void main(String[] args) {
        int[] cars = { 4, 8, 15, 3, 10, 12, 5, 9 };
        int max = 0, curr = 0;
        int k = 3;
        for (int i = 0; i < k; i++) {
            curr += cars[i];
        }
        max = curr > max ? curr : max;
        for (int i = k; i < cars.length; i++) {
            curr -= cars[i - k];
            curr += cars[i];
            max = curr > max ? curr : max;
        }
        System.out.println(max);
    }
}