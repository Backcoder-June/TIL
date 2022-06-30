package Campus.ExtendsTest;

public class Manager extends Employee{

    int gansu;

    public Manager(int id, String name, int salary, int sudang, int gansu) {
        super(id, name, salary, sudang);
        this.gansu = gansu;
    }

    public int totalMoney(){

        return super.totalMoney() + gansu;
    }





}
