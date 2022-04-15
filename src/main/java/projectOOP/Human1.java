package projectOOP;

public class Human1 {
    private String fullName;
    private int year;
    private char gender;

    public Human1(String fullName, int year, char gender){
        System.out.println("I am a Human");
        this.fullName = fullName;
        this.year = year;
        this.gender = gender;
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void printInfo(){
        System.out.println("FullName: " + fullName);
        System.out.println("Year: " + year);
        System.out.println("Gender: " + gender);
    }
}
