package project.QA;

public class ApiTester extends ManualTester{



    @Override
    public String toString() {
        return "ApiTester{" +
                "experience=" + experience +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", year=" + year +
                '}';
    }

    @Override
    void manualTesting() {
        System.out.println("Testing web services and apis");
    }

    @Override
    public void testing() {
        System.out.println("Doing greyBox testing with apis");
    }
}
