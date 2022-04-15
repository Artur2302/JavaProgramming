package project.IT_CompanyService;

import project.Dev.AngularDeveloper;
import project.Dev.ReactJSDeveloper;

import java.util.Scanner;

public class FrontendDevCreator {

    public static void createFrontDeveloper(){
        boolean isMenuActive = true;
        while(isMenuActive){
        System.out.println("Enter the number for creating Frontend Developer");
        System.out.println("1.Create Angular Developer");
        System.out.println("2.Create ReactJS Developer");
        System.out.println("3.Exit");
        Scanner s = new Scanner(System.in);
        int command = s.nextInt();
        switch (command){
            case 1:
                System.out.println(new AngularDeveloper());
                System.out.println("Angular Developer is created");
                break;
            case 2:
                System.out.println(new ReactJSDeveloper());
                System.out.println("React JS Developer is created");
                break;
            case 3:
                System.out.println("Bye");
                isMenuActive = false;
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}}
