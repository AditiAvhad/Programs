import java.util.*;

public class grade {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the students Score");
        int grade = sc.nextInt();
        if (grade>=90 && grade<=100) {
            System.out.println("The grade is A");
        }else if(grade>=80 && grade<=89 ){
            System.out.println("The grade is B");
        }else if(grade>=70 && grade<=79){
            System.out.println("The grade is C");
        }else if(grade>=60 && grade<=69){
            System.out.println("The grade is D");
        }else if(grade<60){
            System.out.println("student is fail");
        }else{
            System.out.println("Invaild student");
        }
    }
}
