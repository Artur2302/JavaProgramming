package project.IT_CompanyService;

import project.QA.QA;

import java.util.Scanner;

public class IT_CompanyService {

    public static void createTester(){

        System.out.println("Enter the number for creating Tester");
        System.out.println("1.Create Automation Tester");
        System.out.println("2.Create Manual Tester");
        System.out.println("3.Exit");

        Scanner s = new Scanner(System.in);
        int command = s.nextInt();
        switch (command){
            case 1:
                break;
            case 2:
                break;
        }
    }

    public static void createDeveloper(){
        System.out.println("Enter the number for creating Developer");
        System.out.println("1.Create Frontend Developer");
        System.out.println("2.Create Backend Developer");
        System.out.println("3.Exit");
        Scanner s = new Scanner(System.in);
        int command = s.nextInt();
        switch (command){
            case 1:
        }
    }

}
