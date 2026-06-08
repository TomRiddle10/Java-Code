import java.util.Scanner;

public class EBill{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double unit;
        System.out.println("Enter the number of unit used:");
        unit=sc.nextDouble();

        double bill =0.0;

        if(unit<0&&unit>=100){
            bill=50+unit*1.5;
        }else if(unit>100&&unit<=200){
            bill=50+150+(unit-100)*2.5;
        }else if(unit>200){
            bill=50+400+(unit-200)*5;
        }

        double x=bill/10.0;
        if(bill>2000){
            bill=bill+x;
        }
        System.out.println("The bill is:"+bill);
}
}