package george.jspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("george.jspring")
@PropertySource("classpath:gameLauncher.properties")
public class SpringConfig {

    @Bean
    public TanksGame tanksGame() {
        return new TanksGame();
    }

    @Bean
    public PlaneGame planeGame() {
        return new PlaneGame();
    }

    @Bean
    public GameLauncher gameLauncher() {
        return new GameLauncher(planeGame());
    }
}
