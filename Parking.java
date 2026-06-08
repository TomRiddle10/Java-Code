import java.util.Scanner;
public class Parking{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double hours;
        System.out.println("Enter the number of hours parked:");
        hours=sc.nextDouble();

        double fee=0.0;

        if(hours<=2){
            fee=hours*100.0;
        }else if(hours>2 && hours<=5){
            fee=200.0+(hours-2)*50.0;
        }else if(hours>5 ){
            fee=350.0+(hours-5)*10.0;
        }

        System.out.println("The parking fee is: "+fee);

    }
}