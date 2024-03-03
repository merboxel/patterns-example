package merboxel.patterns.creational.abstractfactory;

import merboxel.patterns.creational.abstractfactory.person.ProductOwner;
import merboxel.patterns.creational.abstractfactory.person.ScrumMaster;
import merboxel.patterns.creational.abstractfactory.person.TeamMember;

import java.util.ArrayList;

public class Runner {

    public static void main(String... args) {

        ScrumTeamFactory factory = new ScrumTeamFactory();

        ProductOwner productOwner = factory.createProductOwner("Alex");
        ScrumMaster scrumMaster = factory.createScrumMaster("Berta");

        ArrayList<TeamMember> teamMembers = new ArrayList<>();
        teamMembers.add(factory.createTeamMember("Cindy"));
        teamMembers.add(factory.createTeamMember("Daniel"));
    }
}
