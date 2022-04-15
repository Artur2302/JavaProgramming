package project.Dev;

public class AngularDeveloper extends FrontendDeveloper{


    @Override
    public String toString() {
        return "AngularDeveloper{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", year=" + year +
                ", experience=" + experience +
                '}';
    }

    @Override
    public void coding() {
        System.out.println("Coding in Angular");
    }

    @Override
    public void bugFixing() {
        System.out.println("Fixing Angular code bugs");
    }

    @Override
    void codingFrontend() {
        System.out.println("Coding frontend via Angular framework");
    }
}
