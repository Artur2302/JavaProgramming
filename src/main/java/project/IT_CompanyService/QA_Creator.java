package project.IT_CompanyService;

import project.QA.AutomationTester;

import java.util.Scanner;

public class QA_Creator {

    public static void createQA(){
        boolean isMenuActive = true;
        System.out.println("Enter the number for creating Tester");
        System.out.println("1.Create Automation Tester");
        System.out.println("2.Create Manual Tester");
        System.out.println("3.Exit");
        Scanner s = new Scanner(System.in);
        int command = s.nextInt();
        switch (command){
            case 1:
                AutomationQACreator.createAutomationQA();
                break;
            case 2:
                ManualQACreator.createManualQA();
                break;
            case 3:
                System.out.println("Bye");
                isMenuActive = false;
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
