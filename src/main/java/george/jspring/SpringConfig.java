package george.jspring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("george.jspring")
@PropertySource("classpath:gameLauncher.properties")
public class SpringConfig {

}
