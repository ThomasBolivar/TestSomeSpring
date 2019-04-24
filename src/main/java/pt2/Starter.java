package pt2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        // Same old thing, first we create CPXAContext
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnn.xml");

        // Then we grab a bean from Spring Container
        Coach coach = context.getBean("footballCoach",Coach.class);

        // Proceeding with operations (Call a method)
        System.out.println(coach.doSomething());

        coach.getSomething();

        //Don't forget to close the context
        context.close();
    }
}
