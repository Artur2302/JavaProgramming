package project.IT_CompanyService;

import project.Dev.BackendDeveloper;
import project.Dev.Developer;
import project.Dev.JavaDeveloper;

import java.util.Scanner;

public class DevCreator {
    public static void createDev() {
        boolean isMenuActive = true;
        while (isMenuActive) {
            System.out.println("Enter the number for creating Developer");
            System.out.println("1.Create Backend Developer");
            System.out.println("2.Create Frontend Developer");
            System.out.println("3.Exit");
            Scanner s = new Scanner(System.in);
            int command = s.nextInt();
            switch (command) {
                case 1:
                    BackendDevCreator.createBackendDeveloper();
                    break;
                case 2:
                    FrontendDevCreator.createFrontDeveloper();
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
