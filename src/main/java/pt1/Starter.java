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

        // At this moment whenever we call context.getBean Spring come to BaseBallCoach instance a deliver everything for use
        // This happens cuz by default Spring Container shares the bean and not creating it, this process called Singleton Scope
        // If we want to tell the Spring every time to create new instance of a bean we need to declare Scope to Prototype.
        //
        Coach coach = context.getBean("baseBallCoach",Coach.class);

        //Let's get another bean from a container but at this time with Scope = Prototype, and take a look what is going on
        Coach coach1 = context.getBean("baseBallCoach",Coach.class);

        Coach coach2 = context.getBean("someKindOfACoach",Coach.class);
        // calling method from bean
        coach.getDailyWorkout();

        System.out.println(coach.atYourService());
        System.out.println("My email is: " + ((BaseBallCoach) coach).getEmail()+"\nMy name is " + ((BaseBallCoach) coach).getFirstName()
                + " " + ((BaseBallCoach) coach).getLastName());
        // and finally close the context.
        boolean result  = coach==coach1;

        System.out.println("Result " + result);
        System.out.println("Memory location for coach " +  coach);
        System.out.println("Memory location for coach1 " + coach1);
        System.out.println("Memory location for coach2 " + coach2);
        context.close();

    }
}
