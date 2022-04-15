package project.Dev;

public class JavaDeveloper extends BackendDeveloper{

    @Override
    public String toString() {
        return "JavaDeveloper{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", year=" + year +
                ", experience=" + experience +
                '}';
    }

    @Override
    public void codingBackend() {
        System.out.println("Coding backend via Spring framework");
    }

    @Override
    public void coding() {
        System.out.println("Coding in java");
    }

    @Override
    public void bugFixing() {
        System.out.println("Fixing java code bugs");
    }
}
