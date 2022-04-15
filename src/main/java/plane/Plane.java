package plane;

public class Plane {
    private String model;
    private String country;
    private int year;
    private int hours;
    private boolean isMilitary;
    private int weight = 2000;
    private int wingspan;
    private int topSpeed;
    private int seats;
    private double cost;

    public Plane(String model, String country, int year, int hours, boolean isMilitary, int weight,
                 int wingspan, int topSpeed, int seats, double cost){
        setModel(model);
        setCountry(country);
        setYear(year);
        setHours(hours);
        setMilitary(isMilitary);
        setWeight(weight);
        setWingspan(wingspan);
        setTopSpeed(topSpeed);
        setSeats(seats);
        setCost(cost);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.length() > 0){
        this.model = model;
        }else{
            System.out.println("Model should not be blank");
        }

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(country.length() > 0){
            this.country = country;
        }else{
            System.out.println("Country should not be blank");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year > 1903 && year < 2020){
            this.year = year;
        }else{
            System.out.println("Year should be in 1903-2020 range");
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours > 0 && hours < 10000 ){
        this.hours = hours;
        }else {
            System.out.println("Hours should be in 0-10000 range");
        }
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean isMilitary) {
        this.isMilitary = isMilitary;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight > 1000 && weight < 160000){
        this.weight = weight;
        }else {
            System.out.println("Weight should be in 1000-160000 range");
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if(wingspan > 10 && wingspan < 45){
        this.wingspan = wingspan;
        }else{
            System.out.println("The maximum extent across the wings should be in 10-45 range");
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if(topSpeed >= 0 && topSpeed <= 1000){
        this.topSpeed = topSpeed;
        }else{
            System.out.println("TopSpeed should be in  0 - 1000(Maximum) range");
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if(seats >= 0){
        this.seats = seats;
        }else{
            System.out.println("Seats cannot be negative");
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if(cost >= 0){
        this.cost = cost;
        }else{
            System.out.println("Cost cannot be negative");
        }
    }


}
