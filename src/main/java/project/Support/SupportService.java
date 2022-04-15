package project.Support;

public class SupportService {

    public void printTechSupAgents(SupportAgent[] agents){
        for (SupportAgent agent: agents) {
            if(agent instanceof TechSupportAgent)
                System.out.println(agent);
        }
    }

    public void printCallCenterAgents(SupportAgent[] agents){
        for (SupportAgent agent: agents) {
            if(agent instanceof CallCenterAgent)
                System.out.println(agent);
        }
    }

    public void countOfAgentsOlderThan2000(SupportAgent[] agents){
        int count = 0;
        for (SupportAgent agent: agents) {
            if(agent.getYear() < 2000)
                count ++;
        }if(count == 0)
            System.out.println("No older agents");
        else
            System.out.println(count);
    }

    public SupportAgent youngestAgent(SupportAgent[] agents){
        SupportAgent youngestAgent = agents[0];
        for (int i = 0; i < agents.length ; i++) {
            if(youngestAgent.getYear() < agents[i].getYear())
                youngestAgent = agents[i];
        }
        return youngestAgent;
    }
}
