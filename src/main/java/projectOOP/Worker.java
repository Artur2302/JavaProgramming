package projectOOP;

public class Worker extends Human1 {
    private String profession;
    private int salary;
    private int experience;

    public Worker(String fullName, int year, char gender, String profession, int salary, int exp) {
        super(fullName, year, gender);
        this.profession = profession;
        this.salary = salary;
        experience = exp;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Profession: " + profession);
        System.out.println("Salary: " + salary);
        System.out.println("Experience: " + experience);
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
