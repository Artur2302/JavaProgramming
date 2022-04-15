package project.Dev;

public class JS_Developer extends BackendDeveloper{

    @Override
    public String toString() {
        return "JS_Developer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", year=" + year +
                ", experience=" + experience +
                '}';
    }

    @Override
    public void codingBackend() {
        System.out.println("Coding backend in NodeJS framework");
    }

    @Override
    public void coding() {
        System.out.println("Coding in Java Script");
    }

    @Override
    public void bugFixing() {
        System.out.println("Fixing bugs in JS code");
    }
}
