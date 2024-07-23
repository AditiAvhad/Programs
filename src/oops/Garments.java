package oops;

import java.util.Scanner;

public class Garments {

    String Code;
    String Type;
    int Size;
    String Fabric;
    float Price;

    Garments() {
        Code = "Not Allowed";
        Type = "Not Allowed";
        Fabric = "Not Allowed";
        Price = 0;
        Size = 0;
    }
    void Assing() {

        if (Fabric.equals("Cotton")) {
            if (Type.equals("Trouser")) {
                Price = 1300f;
            } else {
                Price = 1100f;
            }
        } else {
            if (Type.equals("Shirt")) {
                Price = 1300f * 90 / 100;
            } else {
                Price = 1100f * 90 / 100;
            }
        }
    }
    void Input() {
        Scanner sc = new Scanner(System.in);

        Code = sc.next();
        Type = sc.next();
        Size = sc.nextInt();
        Fabric = sc.next();
        Assing();
    }
    void Dispay() {
        System.out.println(Code);
        System.out.println(Type);
        System.out.println(Size);
        System.out.println(Fabric);
        System.out.println(Price);
    }
    public static void main(String[] args) {
        Garments obj = new Garments();
        obj.Input();
        obj.Dispay();
    }
}
