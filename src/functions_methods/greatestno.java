package functions_methods;

public class greatestno {
    static int greatest(int num1, int num2,int num3) {
        int ans;
        if(num1>num2 && num1>num3)
          ans=num1;
        else if(num2>num1 && num2>num3)
            ans = num2;
        else {
            ans = num3;
        }
           return ans;

    }

    public static void main(String[] args) {
        System.out.println(greatest(10,20,30));

    }
}

