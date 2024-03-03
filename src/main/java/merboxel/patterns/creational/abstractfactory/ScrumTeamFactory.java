package merboxel.patterns.creational.abstractfactory;

import merboxel.patterns.creational.abstractfactory.person.ProductOwner;
import merboxel.patterns.creational.abstractfactory.person.ScrumMaster;
import merboxel.patterns.creational.abstractfactory.person.TeamMember;

public class ScrumTeamFactory {

    private ScrumTeamAbstractFactory factory;

    public ScrumTeamFactory() {}

    public ScrumTeamFactory(ScrumTeamAbstractFactory factory) {
        this.factory = factory;
    }

    public ProductOwner createProductOwner(String name) {
        return getFactory().createProductOwner(name);
    }
    public TeamMember createTeamMember(String name) {
        return getFactory().createTeamMember(name);
    }
    public ScrumMaster createScrumMaster(String name) {
        return getFactory().createScrumMaster(name);
    }

    private ScrumTeamAbstractFactory getFactory() {

        if(null == factory) {
            switch(getFromConfig()) {
                case TeamType.A -> {
                    this.factory = new TeamAFactory();
                }
                case TeamType.B -> {
                    this.factory = new TeamBFactory();
                }
                default -> {
                    throw new RuntimeException();
                }
            }
        }

        return factory;
    }

    private TeamType getFromConfig() {
        return TeamType.A;
    }
}
