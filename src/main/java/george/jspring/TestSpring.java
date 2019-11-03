package george.jspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
            SpringConfig.class
        );

        GameLauncher gl0 = context.getBean("gameLauncher", GameLauncher.class);

        gl0.play();

        context.close();
    }
}
