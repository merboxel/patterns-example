package merboxel.patterns.creational.abstractfactory.person;

public class TeamMember extends Employee {
    public TeamMember(String team, String name) {
        super(EmployeeType.TEAMMEMBER, team, name);
    }
}
