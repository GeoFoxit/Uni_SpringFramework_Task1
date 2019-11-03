package george.jspring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("planeGame")
public class PlaneGame implements Game {
    @Override
    public void run() {
        System.out.println("Plane game has been launched");
    }
}
