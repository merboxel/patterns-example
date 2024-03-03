package merboxel.patterns.creational.abstractfactory.person;

public class Employee {

    EmployeeType type;
    String team;
    String name;

    public Employee(EmployeeType type,String team, String name) {
        this.type = type;
        this.team = team;
        this.name = name;
    }
}
