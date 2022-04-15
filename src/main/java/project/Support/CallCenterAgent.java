package project.Support;

public class CallCenterAgent extends SupportAgent{


    @Override
    public String toString() {
        return "CallCenterAgent{" +
                "experience=" + experience +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", year=" + year +
                '}';
    }

    @Override
    void supporting() {
        System.out.println("Doing informational support about product");
    }

    @Override
    public void answeringCalls() {
        System.out.println("Answering information type calls");
    }

    @Override
    public void workingWithTickets() {
        System.out.println("Opening and solving information type tickets");
    }
}
