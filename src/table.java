import java.util.*;

public class table {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int table= sc.nextInt();
        int i=1;
        while(i<=10)
    {
            System.out.println(table+"*"+i+"="+i*table);
            i++;
        }
    }
}
