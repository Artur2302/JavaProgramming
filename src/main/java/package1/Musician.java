package package1;

public abstract class Musician {
    private String name;

    public abstract void playMusic();
    public abstract void readNotes(String note);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
