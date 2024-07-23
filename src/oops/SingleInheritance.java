package oops;

class PersonalDetails1{
    String name;
    int password;
    int age;
}
class EmployeeDetails extends PersonalDetails1{

    int salary;
    String companyName;
}
class Maritialstatus extends EmployeeDetails{
    boolean status=true;
    String wifename;
}
public class SingleInheritance {
    public static void main(String[] args){
        Maritialstatus obj1=new Maritialstatus();
        obj1.name="Aditi";
        obj1.age=22;
        obj1.password=292002;
        obj1.salary=20000;
        obj1.companyName="upgrad";
        obj1.wifename="xyz";
        System.out.println(obj1.age+" "+obj1.salary+" "+obj1.password+" "+obj1.wifename+" "+ obj1.companyName);
    }

}
