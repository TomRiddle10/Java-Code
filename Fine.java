public class Fine {
    public static void main(String[] args){
        int speed = 105;
        int repeated=1;
        int totalFine=0;
        int fine=0;

        if(speed>80){
                System.out.println("You are speeding and your fine is 500");
                fine=500;
        }else if(speed>100){
                System.out.println("You are speeding and your fine is 1000");
                fine=1000;
        }
        totalFine=fine;
        if(repeated==1){
                System.out.println("You have repeated the offense and your fine is doubled");
                totalFine = fine *2;
                System.out.println("Your total fine is " + totalFine);
        }else{
                System.out.println("You have not repeated the offense and your fine is not doubled");
                System.out.println("Your total fine is " + totalFine);
        }
    }
}
