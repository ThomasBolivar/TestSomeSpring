package pt1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        /*To start work with Spring we need to download JAR file of spring core/beans/context, or we can use dependencies
        *and let the Maven download it for us.
        * Next step is to set up Application Context(Spring Container) and after that we can load this context for retrieving beans
        * To get beans from context we need to use: ClassPathXmlApplicationContext.
        * After that we need to get the bean from context by using context.getBean, and specify alias (which is an id from app.config
        * and the class name, after that we are done, bean is ready to use :)
        * */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Now we need to retrieve bean from spring container.
        Coach coach = context.getBean("baseBallCoach",BaseBallCoach.class);
        // calling method from bean
        coach.getDailyWorkout();
        // and finally close the context.
        context.close();

    }
}
