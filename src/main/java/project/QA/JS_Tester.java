package project.QA;

public class JS_Tester extends AutomationTester {


    @Override
    public String toString() {
        return "JS_Tester{" +
                "experience=" + experience +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", year=" + year +
                '}';
    }

    @Override
    void automationTesting() {
        System.out.println("Testing in cypress");
    }


    @Override
    public void testing() {
        System.out.println("Doing blackbox testing in JS code");
    }
}
