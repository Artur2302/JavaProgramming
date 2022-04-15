package Interface;

public class Facebook extends WebPage implements SocialWebPage,Gaming{


    @Override
    public void register(String email, String password) {

    }

    @Override
    public boolean login(String email, String password) {
        return false;
    }

    @Override
    public void connect(String email, String password) {

    }

    @Override
    public void playGame(String game, int countOfPlayers) {

    }

    @Override
    public String createGame() {
        return null;
    }
}
