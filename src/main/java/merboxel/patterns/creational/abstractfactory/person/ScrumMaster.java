package merboxel.patterns.creational.abstractfactory.person;

public class ScrumMaster extends Employee {
    public ScrumMaster(String team, String name) {
        super(EmployeeType.SCRUMMASTER, team, name);
    }
}
