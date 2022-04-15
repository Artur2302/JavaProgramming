package project.IT_CompanyService;

import project.Support.CallCenterAgent;
import project.Support.TechSupportAgent;

import java.util.Scanner;

public class SupportAgentCreator {
    public static void createAgent() {
        boolean isMenuActive = true;
        while (isMenuActive) {
            System.out.println("Enter the number for creating Agent");
            System.out.println("1.Create TechSupport Agent");
            System.out.println("2.Create CallCenter Agent");
            System.out.println("3.Exit");
            Scanner s = new Scanner(System.in);
            int command = s.nextInt();
            switch (command) {
                case 1:
                    System.out.println(new TechSupportAgent());
                    System.out.println("Tech support agent is created");
                    break;
                case 2:
                    System.out.println(new CallCenterAgent());
                    System.out.println("Call center agent is created");
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
