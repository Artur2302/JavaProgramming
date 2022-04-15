package projectOOP;

public class WorkTest {
    public static void main(String[] args) {
        Human1 h1 = new Human1("Human Jones",100, 'm' );

        Worker w = new Worker("Ani Xachikyan", 23,'f',"Designer",
                2000, 5);
        

        Developer d = new Developer("Anna Hovakimyan", 30, 'f', "Developer",
                3000,10,"Angular", "Java");


        h1.printInfo();
        System.out.println("-----------------");
        w.printInfo();
        System.out.println("-----------------");
        d.printInfo();
    }
}
