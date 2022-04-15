package project.Dev;

public class DeveloperService {

    public void printBackendDevelopers(Developer[] devs){
        for (Developer dev: devs) {
            if(dev instanceof BackendDeveloper)
                System.out.println(dev);
        }
    }

    public void printFrontendDevelopers(Developer[] devs){
        for (Developer dev: devs) {
            if(dev instanceof FrontendDeveloper)
                System.out.println(dev);
        }
    }

    public void printDevsWithMoreThan2YearExp(Developer[] devs){
        for (Developer dev: devs) {
            if(dev.getExperience() > 2)
                System.out.println(dev);
        }
    }
}
