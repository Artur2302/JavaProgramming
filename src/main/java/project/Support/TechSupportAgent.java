package project.Support;

public class TechSupportAgent extends SupportAgent {



    @Override
    public String toString() {
        return "TechSupportAgent{" +
                "experience=" + experience +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", year=" + year +
                '}';
    }

    @Override
    void supporting() {
        System.out.println("Doing technical support");
    }

    @Override
    public void answeringCalls() {
        System.out.println("Answering technical type calls");
    }

    @Override
    public void workingWithTickets() {
        System.out.println("Opening and solving technical type tickets");
    }
}
