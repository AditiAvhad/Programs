import java.util.*;
public class temp {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int temp=sc.nextInt();

        if(temp<10){
            System.out.println("temp is for skiing");
        }else if(temp >= 10 && temp<=20){
            System.out.println("temp is for hiking");
        }else if(temp > 20 && temp<=30){
            System.out.println("temp is for cycling");
        }else if(temp >30){
            System.out.println("temp is for swimming");
        }else{
            System.out.println("Invaild temp");
        }

    }

}
