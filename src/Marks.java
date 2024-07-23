import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if (marks <= 100 && marks >= 91) {
            System.out.println("The Grade is A+");
        } else if (marks >= 90 && marks >= 81) {
            System.out.println("The Grade is A");

        } else if (marks >= 80 && marks >= 71) {
            System.out.println("The Grade is B+");
        } else if (marks >= 70 && marks >= 61) {
            System.out.println("The Grade is B");
        } else if (marks >= 60 && marks >= 40) {
            System.out.println("The Grade is C+");
        } else {
            System.out.println("FAil");
        }


    }
}
