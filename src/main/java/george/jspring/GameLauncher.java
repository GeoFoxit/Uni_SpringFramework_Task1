package george.jspring;

public class GameLauncher {
    private Game game;
    private String user;

    public void setGame(Game game) {
        this.game = game;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void play() {
        game.run();
    }
}
