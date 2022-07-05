package Campus.Test.ExtendsTest;

public class Engineer extends Employee {
    int jasu;
    int gisu;

    public Engineer(int id, String name, int salary, int sudang, int jasu, int gisu) {
        super(id, name, salary, sudang);
        this.gisu = gisu;
        this.jasu = jasu;
    }

    public int totalMoney(){
        return super.totalMoney() + jasu + gisu;
    }




}
