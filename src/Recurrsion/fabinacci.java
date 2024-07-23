package Recurrsion;

public class fabinacci {
    static int a = 0, b = 1;

    void fab(int x) {
        if (x == 10)
            return;
        int num = a + b;
        System.out.print(num);
        a = b;
        b = num;
        fab(x + 1);
    }

    public static void main(String[] args) {
        fabinacci obj = new fabinacci();
        System.out.println(0);
        System.out.println(1);
        obj.fab(1);
    }
}



