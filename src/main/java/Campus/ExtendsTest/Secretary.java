package Campus.ExtendsTest;

public class Secretary extends Employee{

    int bisu;

    public Secretary(int id, String name, int salary, int sudang, int bisu) {
        super(id, name, salary, sudang);
        this.bisu = bisu;
    }

    public int totalMoney(){
        return super.totalMoney() + bisu;
    }




}
