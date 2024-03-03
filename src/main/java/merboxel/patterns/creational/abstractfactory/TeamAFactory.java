package merboxel.patterns.creational.abstractfactory;

import merboxel.patterns.creational.abstractfactory.person.ProductOwner;
import merboxel.patterns.creational.abstractfactory.person.ScrumMaster;
import merboxel.patterns.creational.abstractfactory.person.TeamMember;

public class TeamAFactory extends ScrumTeamAbstractFactory {

    private final String TeamName = "A";

    public ProductOwner createProductOwner(String name) {
        return new ProductOwner(TeamName, name);
    }

    public TeamMember createTeamMember(String name) {
        return new TeamMember(TeamName, name);
    }

    public ScrumMaster createScrumMaster(String name) {
        return new ScrumMaster(TeamName, name);
    }
}
