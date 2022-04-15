package lessonOOP;

import java.util.Arrays;

public class StudentService {
    public static void printFullName(Student[] students){
        for (Student s: students) {
            System.out.println(s.firstName + " " + s.lastName);
        }
    }

    public static void printMales(Student[] students){
        for (Student student: students) {
            if(student.getGender() == 'm')
                System.out.println(student);
        }
    }

    public static void printFemalesWithMarkGreater50_4(Student[] students){
        for (Student student: students) {
            if(student.getGender() == 'f' && student.getMark() > 50.4)
                System.out.println(student);
        }
    }

    public static void printStudentWithMinimalMark(Student[] students){
        Student min = students[0];
        for (Student student: students) {
            if(min.getMark() > student.getMark())
                min = student;
        }
        System.out.println(min);
    }

    public static void printStudentsSortedByMark(Student[] students){
        Student temp = null;
        for (int i = 1; i < students.length ; i++) {
            for (int j = 0; j < i ; j++) {
                if(students[i].getMark() < students[j].getMark()){
                    temp = students[i];
                     students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(students));
    }

    public static void printFemStudentsSortedByYear(Student[] students){
        Student temp = null;

        for (int i = 1; i < students.length ; i++) {
            for (int j = 0; j < i ; j++) {
                if(students[j].getGender() == 'f'){
                    if(students[i].getYear() > students[j].getYear()){
                        temp = students[i];
                        students[i] = students[j];
                        students[j] = temp;
                    }
                }
            }
        }
        for (int i = 0; i <students.length ; i++) {
            if(students[i].getGender() == 'f')
                System.out.println(students[i]);
        }
    }
}
