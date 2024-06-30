package package_com.company;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks obtained in each subject");

        System.out.print("Physics: ");
        int m1 = sc.nextInt();
        System.out.print("Chemistry: ");
        int m2 = sc.nextInt();
        System.out.print("Mathematics: ");
        int m3 = sc.nextInt();
        System.out.print("Biology: ");
        int m4 = sc.nextInt();

        int totalMarks = (m1 + m2 + m3 + m4);
        System.out.print("total marks: "+totalMarks);
        double averagePercentage = (totalMarks / 4.0);
        System.out.println("\naverage Percentage: "+averagePercentage+"%");

        if(averagePercentage >= 90){
            System.out.println("You passed with grade A!");
        } else if (averagePercentage >= 80) {
            System.out.println("You passed with grade B!");
        } else if (averagePercentage >= 70) {
            System.out.println("You passed with grade C!");
        }
        else if(averagePercentage >=35 ){
            System.out.println("You pass!");
        } else if (averagePercentage < 35) {
            System.out.println("You Fail!!!");
        }
    }
}