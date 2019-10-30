package george.jspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Game g = context.getBean("gameBean", Game.class);

        GameLauncher gl = new GameLauncher(g);

        gl.play();

        context.close();
    }
}
