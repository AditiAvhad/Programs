package oops;
class PersonalDetails2{
    String name;
    int password;
    int age;
}
class CompanyOffer1 extends PersonalDetails2{
    String CompanyName;
    int Salary;
}
class CompanyOffer2 extends PersonalDetails2 {
    String CompanyName;
    int Salary;

    public class HirarcialInheritance {
        public static void main(String[] args) {
            CompanyOffer1 obj = new CompanyOffer1();
            obj.CompanyName = "Tcs";
            obj.name = "aditi";
            obj.Salary = 50000;

            CompanyOffer2 obj1 = new CompanyOffer2();
            obj1.CompanyName = "Wipro";
            obj1.name = "aditya";
            obj1.Salary = 40000;
        }
    }
}
