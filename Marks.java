import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        int tot_w=0;
        int tot_m=0;
        int marks=0;
        int tot_data=0;
        int weightage=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks and weightage for 3 subjects:");
        for(int i=1; i<=3; i++) {
            System.out.println("Subject " + i + ":");
            System.out.print("Marks: ");
            marks = sc.nextInt();
            System.out.print("Weightage: ");
            weightage = sc.nextInt();
        }
        if(tot_w == 10) {
        tot_data += (tot_m* tot_w) / 10;
        if (tot_data >= 90) {
            System.out.println("Grade: A");
        } else if (tot_data >= 80) {
            System.out.println("Grade: B");
        } else if (tot_data >= 70) {
            System.out.println("Grade: C");
        } else if (tot_data >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    } else {
            System.out.println("Total weightage should be 10.");
        }
    }
}

