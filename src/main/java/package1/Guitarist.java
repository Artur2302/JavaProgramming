package package1;

public abstract class Guitarist extends Musician{



    @Override
    public void readNotes(String note) {
        System.out.println("Reading guitar notes " + note);
    }
}
