package project;

import project.IT_CompanyService.DevCreator;
import project.IT_CompanyService.IT_CompanyService;
import project.IT_CompanyService.QA_Creator;
import project.IT_CompanyService.SupportAgentCreator;
import project.Support.TechSupportAgent;

import java.util.Scanner;

public class IT_Company {
    public static void main(String[] args) {
        boolean isMenuActive = true;
        while(isMenuActive) {
        System.out.println("Welcome to IT company");
        System.out.println("Please enter the number of the preferred option");
        System.out.println("1.Create QA Tester");
        System.out.println("2.Create Developer");
        System.out.println("3.Create Support Agent");
        System.out.println("4.Exit");

            Scanner s = new Scanner(System.in);
            int command = s.nextInt();
            switch (command) {
                case 1:
                    QA_Creator.createQA();
                    break;
                case 2:
                    DevCreator.createDev();
                    break;
                case 3:
                    SupportAgentCreator.createAgent();
                    break;
                case 4:
                    System.out.println("Bye");
                    isMenuActive = false;
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }



    }


}