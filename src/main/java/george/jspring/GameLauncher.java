package george.jspring;

public class GameLauncher {
    private Game game;

    public GameLauncher(Game game) {
        this.game = game;
    }

    public void play() {
        game.run();
    }
}
