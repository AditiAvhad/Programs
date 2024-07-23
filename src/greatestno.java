import java.util.Scanner;

public class greatestno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        int thirdNum = sc.nextInt();

        if (firstNum >  secondNum && firstNum > secondNum) {
            System.out.println("firstNum is greater");
        } else if (secondNum > firstNum && secondNum > thirdNum ) {
            System.out.println("secondNum is greater");
        } else {
            System.out.println("thirdNum is greater");
        }

    }
}
