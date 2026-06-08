import java.util.Scanner;
public class PasswordChecking {
    public static void main(String[] args){
        String pass="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your password:");
        pass=sc.nextLine();
        for(int i=0;i<3;i++){
            if(pass.equals("12345")){
                System.out.println("Welcome to your account");
                break;
            }else{
                System.out.println("Incorrect password. Try again.");
                pass=sc.nextLine();
                if(i==2){
                    System.out.println("Your account is locked. Please contact support.");
                }
            }
        }
    }
}
