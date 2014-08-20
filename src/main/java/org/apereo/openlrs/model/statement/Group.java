package org.apereo.openlrs.model.statement;

/**
 * A Group represents a collection of Agents and can be used in most of the same situations an Agent can be used. There are two types of Groups, anonymous and identified.
 *
 * @author Robert E. Long (rlong @ unicon.net)
 */
public class Group extends BaseActorObjectType {

    private Agent[] member;

    public String getObjectType() {
        return "Group";
    }

    public Agent[] getMember() {
        return member;
    }

    public void setMember(Agent[] member) {
        this.member = member;
    }

    public boolean isAnonymous() {
        return inverseFunctionalIdentifier.isEmpty();
    }

}
