package project.IT_CompanyService;

import project.Dev.JS_Developer;
import project.Dev.JavaDeveloper;

import java.util.Scanner;

public class BackendDevCreator {
    public static void createBackendDeveloper(){
        boolean isMenuActive = true;
        while(isMenuActive){
        System.out.println("Enter the number for creating Backend Developer");
        System.out.println("1.Create Java Developer");
        System.out.println("2.Create JS Developer");
        System.out.println("3.Exit");
        Scanner s = new Scanner(System.in);
        int command = s.nextInt();
        switch (command){
            case 1:
                System.out.println(new JavaDeveloper());
                System.out.println("Java Developer is created");
                break;
            case 2:
                System.out.println(new JS_Developer());
                System.out.println("JS Developer is created");
                break;
            case 3:
                System.out.println("Bye");
                isMenuActive = false;
                break;
            default:
                System.out.println("invalid input");

        }
    }
}}
