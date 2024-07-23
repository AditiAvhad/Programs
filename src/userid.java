import java.util.Scanner;

public class userid {
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            int userid = sc.nextInt();
            int Password = sc.nextInt();
            if(userid == 123){
                if(Password==321){
                    System.out.println("login sucessful");
                }else{
                    System.out.println("p");
                }

            }else{
                System.out.println("wrong user id");
            }
            }


        }
