package merboxel.patterns.creational.abstractfactory.person;

public class ProductOwner extends Employee{
    public ProductOwner(String team, String name) {
        super(EmployeeType.PRODUCTOWNER, team, name);
    }
}
