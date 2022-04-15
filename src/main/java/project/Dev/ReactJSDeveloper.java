package project.Dev;

public class ReactJSDeveloper extends FrontendDeveloper {


    @Override
    public String toString() {
        return "ReactJSDeveloper{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", year=" + year +
                ", experience=" + experience +
                '}';
    }

    @Override
    public void coding() {
        System.out.println("Coding in JS");
    }

    @Override
    public void bugFixing() {
        System.out.println("Fixing bugs in JS code");
    }

    @Override
    void codingFrontend() {
        System.out.println("Coding frontend in ReactJS framework");
    }
}
