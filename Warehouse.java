import java.util.Scanner;
public class Warehouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prod_id, cu_stock, req_stock;
        System.out.println("Enter total number of products:");
        int total_product = sc.nextInt();
        int i = 0;
        int a = 0; 
        while (i < total_product) {
            System.out.println("Enter Product ID:");
            prod_id = sc.nextInt();
            System.out.println("Enter Current Stock:");
            cu_stock = sc.nextInt();
            System.out.println("Enter Minimum Required Stock:");
            req_stock = sc.nextInt();
            if (cu_stock < req_stock) {
                System.out.println("Product ID " + prod_id +" needs to be restocked by " +(req_stock-cu_stock) + " units.");
                a++;
            }
            i++; 
        }
        System.out.println("Total number of products to be restocked is " + a + ".");
    }
}