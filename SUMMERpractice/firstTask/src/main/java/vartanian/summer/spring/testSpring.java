package vartanian.summer.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Films firstFilm = context.getBean("Action", Films.class);
        Films secondFilm = context.getBean("Action", Films.class);
        firstFilm.playFilm();

        System.out.println("Is the firstfilm the same as the second?:" + (firstFilm == secondFilm));

        firstFilm.setRating(7);

        System.out.println("First film rating:" + firstFilm.getRating());
        System.out.println("Second film rating:" + secondFilm.getRating());
        Films film2 = context.getBean("Adventure", Films.class);
        film2.playFilm();
        System.out.println("User rating:"+film2.getRating());
        Films film3 = context.getBean("Comedy", Films.class);
        film3.playFilm();
        Films film4 = context.getBean("Drama", Films.class);
        film4.playFilm();

        context.close();
    }
}
