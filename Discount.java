import java.util.*;
public class Discount {
    public static void main(String[] args){
            int amount=0;
            int premium=0;
            double discount=0;
            double totalAmount=0;

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 1 if the user has premium else 0: ");
            premium=sc.nextInt();
            
            System.out.println("Enter the amount: ");
            amount=sc.nextInt();

            if(premium==1){
                if(amount>=3000){
                    discount=amount*0.15;
                    totalAmount=amount-discount;
                    System.out.println("Total Amount:"+totalAmount);
                }else if(amount<5000){
                    discount=amount*0.25;
                    totalAmount=amount-discount;
                    System.out.println("Total Amount:"+totalAmount);    
                }
            }else{
                if(amount>=3000){
                    discount=amount*0.10;
                    totalAmount=amount-discount;
                    System.out.println("Total Amount:"+totalAmount);
                }else if(amount<5000){
                    discount=amount*0.20;
                    totalAmount=amount-discount;
                    System.out.println("Total Amount:"+totalAmount);    
                }
            }
        }
}
