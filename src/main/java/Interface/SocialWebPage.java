package Interface;

public interface SocialWebPage {
    public void register(String email, String password);
    public boolean login(String email, String password);
    public void connect(String email, String password);
}
