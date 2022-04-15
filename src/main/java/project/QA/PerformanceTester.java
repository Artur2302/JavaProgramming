package project.QA;

public class PerformanceTester extends ManualTester{


    @Override
    public String toString() {
        return "PerformanceTester{" +
                "experience=" + experience +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", year=" + year +
                '}';
    }

    @Override
    void manualTesting() {
        System.out.println("Doing Performance testing");
    }

    @Override
    public void testing() {
        System.out.println("BlackBox Testing");
    }
}
