import java.util.*;

public class evenno {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
       int evenno= sc.nextInt();
        for(int i=200;i<=500;i++){
           if(i%2==0){
               System.out.println(i);
           }
        }
    }
}

