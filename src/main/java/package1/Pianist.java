package package1;

public class Pianist extends Musician{
    @Override
    public void playMusic() {
        System.out.println(getName() + " is playing piano");
    }

    @Override
    public void readNotes(String note) {
        System.out.println("Reading piano notes" + note);
    }
}
