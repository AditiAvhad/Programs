package Strings;

import java.util.Scanner;

//reverse the string
//wheather string is palindrome or not
public class reversestring {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String rev="";
        int n=name.length();
        for(int i=n-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println(rev);
        if(name.equals(rev)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }

    }

}
