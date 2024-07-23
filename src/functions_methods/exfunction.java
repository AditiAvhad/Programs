package functions_methods;

public class exfunction {
    static void swapno(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1+" "+num2);

    }

    public static void main(String[] args) {
        swapno(60,80);
    }
}