package george.jspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class GameLauncher {
    private Game game;
    @Value("${gameLauncher.userRole}")
    private String userRole;

    public GameLauncher(Game game) {
        this.game = game;
    }

    public void play() {
        game.run();
        System.out.println("User role is "+this.userRole);
    }
}
