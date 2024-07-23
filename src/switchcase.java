import java.util.*;

public class switchcase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int days= sc.nextInt();
        switch(days){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please Enter the no between 1-7");

        }

    }
}
