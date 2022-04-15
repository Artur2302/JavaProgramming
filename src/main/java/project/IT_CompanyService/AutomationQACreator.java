package project.IT_CompanyService;

import project.QA.JS_Tester;
import project.QA.JavaTester;

import java.util.Scanner;

public class AutomationQACreator {

    public static void createAutomationQA() {
        boolean isMenuActive = true;
        while (isMenuActive) {
            System.out.println("Enter the number for creating Automation Tester");
            System.out.println("1.Create Java Tester");
            System.out.println("2.Create JS Tester");
            System.out.println("3.Exit");
            Scanner s = new Scanner(System.in);
            int command = s.nextInt();
            switch (command) {
                case 1:
                    System.out.println(new JavaTester());
                    System.out.println("Java Tester is created");
                    break;
                case 2:
                    System.out.println(new JS_Tester());
                    System.out.println("JS_Tester is created");
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
}
