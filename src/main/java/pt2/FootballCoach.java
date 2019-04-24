package pt2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Spring will search for this annotation to create a bean
// We can even no specify bean id after @Component ("We don't need to do this"),
// ofc you can do it if you need to create you custom name for Bean, but Spring will auto-generate name(bean-id) for us
// by default bean id equals to name of the class but with lower case first letter, in our case it's going to be footballCoach.
@Component
public class FootballCoach implements Coach {

    @Value("${some.firstName}")
    private String firstName;

    @Value("${some.lastName}")
    private String lastName;
    // @Autowired annotation allows Spring to resolve and inject collaborating beans into your bean.
    // since Spring 4 you can even not use that annotation on top of the constructor if there is only one constructor,
    // you can even use Autowired with private fields and setters.


    // If we are not specifying @Qualifier annotation there is going to be NoUniqueBeanDefinitionException, this heppens cuz we
    // have two classes which implements SomeService interface, and whenever Spring tries to inject it he doesn't know which one to pick
    // If we are using Qualifier with Constructor, we have to write it inside of a constructor where arguments are, look at example below
    // @Qualifier declares which one to use.
    @Autowired
    @Qualifier("randomService")
    private SomeService someService;


    /*
    @Autowired
    public FootballCoach (@Qualifier("randomService") SomeService someService){
        this.someService=someService;
    }
    */

    /*
    *This will work as well
    @Autowired
    public void doInjection(SomeService someService){
        this.someService=someService;
    }
    */

    @Override
    public String doSomething() {
        return "Run 2000 km, just do it!";
    }

    @Override
    public String getSomething() {

        return someService.getSomething();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
