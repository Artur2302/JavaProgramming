package project.IT_CompanyService;

import org.w3c.dom.ls.LSOutput;
import project.QA.ApiTester;
import project.QA.PerformanceTester;

import java.util.Scanner;

public class ManualQACreator {
    public static void createManualQA() {
        boolean isMenuActive = true;
        while (isMenuActive) {
            System.out.println("Enter the number for creating Manual Tester");
            System.out.println("1.Create Performance Tester");
            System.out.println("2.Create Api Tester");
            System.out.println("3.Exit");
            Scanner s = new Scanner(System.in);
            int command = s.nextInt();
            switch (command) {
                case 1:
                    System.out.println(new PerformanceTester());
                    System.out.println("Performance Tester is created");
                    break;
                case 2:
                    System.out.println(new ApiTester());
                    System.out.println("Api Tester is created");
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
