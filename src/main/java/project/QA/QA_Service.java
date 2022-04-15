package project.QA;

public class QA_Service {

    public void printAutomationTesters(QA[] testers){
        for (QA tester: testers) {
            if(tester instanceof AutomationTester)
                System.out.println(tester);
            else
                System.out.println("There are no automation testers");
        }
    }

    public void printManualTesters(QA[] testers){
        for (QA tester : testers) {
            if(tester instanceof ManualTester)
                System.out.println(tester);
            else
                System.out.println("There are no Manual Testers");
        }
    }

    public void printAllFemaleTesters(QA[] testers){
        for (QA tester : testers) {
            if(tester.getGender() == 'f')
                System.out.println(tester);
            else
                System.out.println("No Female Testers");

        }
    }
}
