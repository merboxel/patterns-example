package merboxel.patterns.creational.abstractfactory;

import merboxel.patterns.creational.abstractfactory.person.ProductOwner;
import merboxel.patterns.creational.abstractfactory.person.ScrumMaster;
import merboxel.patterns.creational.abstractfactory.person.TeamMember;

public abstract class ScrumTeamAbstractFactory {

    public abstract ProductOwner createProductOwner(String name);
    public abstract TeamMember createTeamMember(String name);
    public abstract ScrumMaster createScrumMaster(String name);

}
