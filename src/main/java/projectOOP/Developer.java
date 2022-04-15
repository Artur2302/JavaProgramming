package projectOOP;

public class Developer extends Worker{
    private String frontEnd;
    private String backEnd;

    public Developer(String fullName, int year, char gender, String profession, int salary, int exp,
                     String frontEnd, String backEnd ){
        super(fullName,year,gender,profession,salary,exp);
        this.frontEnd = frontEnd;
        this.backEnd = backEnd;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Backend: " + backEnd);
        System.out.println("Frontend: " + frontEnd);
    }

    public String getFrontEnd() {
        return frontEnd;
    }

    public void setFrontEnd(String frontEnd) {
        this.frontEnd = frontEnd;
    }

    public String getBackEnd() {
        return backEnd;
    }

    public void setBackEnd(String backEnd) {
        this.backEnd = backEnd;
    }
}
