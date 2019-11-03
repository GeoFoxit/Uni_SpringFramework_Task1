package george.jspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        GameLauncher gl0 = context.getBean("gameLauncher", GameLauncher.class);
        GameLauncher gl1 = context.getBean("gameLauncher", GameLauncher.class);

        System.out.println(gl0 == gl1);

        gl0.play();

        context.close();
    }
}
