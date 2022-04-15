package project.QA;

public class JavaTester extends AutomationTester {


    @Override
    public String toString() {
        return "JavaTester{" +
                "experience=" + experience +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", year=" + year +
                '}';
    }

    @Override
    void automationTesting() {
        System.out.println("Testing in Selenium framework");
    }

    @Override
    public void testing() {
        System.out.println("WhiteBox testing in java code");
    }


}
