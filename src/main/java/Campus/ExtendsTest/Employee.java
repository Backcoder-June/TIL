package Campus.ExtendsTest;

public class Employee {

    int id;
    String name;
    int salary;
    int sudang;
    int totalSalary;             // 메소드용

    public Employee(int id, String name, int salary, int sudang){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.sudang = sudang;
    }

    public int totalMoney(){
        totalSalary = salary + sudang;
        return totalSalary;
    }




}
