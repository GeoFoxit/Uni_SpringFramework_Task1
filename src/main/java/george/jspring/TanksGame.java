package george.jspring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class TanksGame implements Game {
    @Override
    public void run() {
        System.out.println("Tanks game has been launched");
    }
}
