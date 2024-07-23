package oops;

import javax.print.attribute.standard.PrinterName;

class Student{
    String name="Adu";
    void Printname(){
        System.out.println(name);
    }
}
class NewStudent extends Student{
    String name="Aditiiiii";
    void Printname(){
        System.out.println(super.name);
    }
}
public class overriding {
    public static void main(String[] args) {
        NewStudent obj=new NewStudent();
        obj.Printname();

        Student obj1=new Student();
        obj1.Printname();

    }
}
