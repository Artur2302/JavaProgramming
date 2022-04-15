package lessonOOP;

public class Student {
    public String firstName;
    public String lastName;
    public int year;
    public char gender;
    public double mark;

    public Student(String s) {
        String[] parts = s.split(",");
         firstName = parts[0];
         lastName = parts[1];
         year = Integer.parseInt(parts[2]);
         gender = parts[3].charAt(0);
         mark = Double.parseDouble(parts[4]);
    }

    public double getMark() {
        return mark;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getYear() {
        return year;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + year +
                ", gender=" + gender +
                ", mark=" + mark +
                '}';
    }
}
