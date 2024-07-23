package functions_methods;

public class salary {
    static void salary(int salary) {
        if(salary>=20000 && salary<=40000)
            System.out.println("salary between 20000 to 40000");
        else{
            System.out.println("salary not between 20000 to 40000");
        }

    }
    public static void main(String[] args) {
        salary(10000);

    }
}


