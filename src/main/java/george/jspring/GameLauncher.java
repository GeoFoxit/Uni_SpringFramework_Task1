package george.jspring;

public class GameLauncher {
    private Game game;
    private String userRole;

    public void setGame(Game game) {
        this.game = game;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public void play() {
        game.run();
    }
}
