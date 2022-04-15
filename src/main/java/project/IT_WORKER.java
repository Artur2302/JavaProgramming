package project;

import project.Files.FileService;

import java.util.Scanner;

public class IT_WORKER {
    public String name;
    public char gender;
    public int year;
    public int experience;

    public IT_WORKER() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = s.next();
        System.out.println("Enter the gender , 'm'(male) or 'f'(female)");
        char gender = s.next().charAt(0);
        System.out.println("Enter the year");
        int year = s.nextInt();
        System.out.println("Enter experience");
        int experience = s.nextInt();
        setName(name);
        setGender(gender);
        setYear(year);
        setExperience(experience);
        FileService.writeInDevFile(name,gender,year,experience);
        FileService.writeInQAFile(name,gender,year,experience);
        FileService.writeInSupportFile(name,gender,year,experience);

    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if(experience >= 0)
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.matches("[A-Z],[a-z]+"))
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year > 1911 && year < 2022 )
        this.year = year;
    }
}
