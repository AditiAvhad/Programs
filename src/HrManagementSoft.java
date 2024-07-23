public class HrManagementSoft {

    String name;
    String company_name = "Mind Tree";
    String department_name = "Software Department";
    String date;
    float salary;
    float bonus;


    HrManagementSoft(String name, String date, float salary) {
        this.name = name;
        this.date = date;
        this.salary = salary;
    }

    void employee() {
        System.out.println("Name: " + name + " Comapny Name: " + company_name + " Dept. name: " + department_name + " Joing Date: " + date + " salary: " + salary);
        if (salary < 20000 && salary > 0) {
            bonus = (salary * 0.1f);
        }
        System.out.println("Bonus: " + bonus);
    }

    public static void main(String[] args) {
        HrManagementSoft asObject = new HrManagementSoft("SRC", "12_02_2002", 75000.0f);
        asObject.employee();
        System.out.println();
        HrManagementSoft srcObj = new HrManagementSoft("Aditi", "16_06_2002", 12000.0f);
        srcObj.employee();
    }
}
