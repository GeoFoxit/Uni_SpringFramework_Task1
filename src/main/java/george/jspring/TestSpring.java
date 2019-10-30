package george.jspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        No need to it
//        Game g = context.getBean("gameBean", Game.class);
//        GameLauncher gl = new GameLauncher(g);

        GameLauncher gl0 = context.getBean("gameLauncherBean", GameLauncher.class);
        GameLauncher gl1 = context.getBean("gameLauncherBean", GameLauncher.class);
        gl0.play();

        System.out.println(gl0 == gl1);

        context.close();
    }
}
