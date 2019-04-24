package pt2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Spring will search for this annotation to create a bean
// We can even no specify bean id after @Component ("We don't need to do this"),
// ofc you can do it if you need to create you custom name for Bean, but Spring will auto-generate name(bean-id) for us
// by default bean id equals to name of the class but with lower case first letter, in our case it's going to be footballCoach.
@Component
public class FootballCoach implements Coach {

    // @Autowired annotation allows Spring to resolve and inject collaborating beans into your bean.
    // sine Spring 4 you can even not use that annotation on top of the constructor if there is only one constructor,
    // you can even use Autowired with private fields and setters.


    // @Autowired - will work as well
    private SomeService someService;


    @Autowired
    public FootballCoach (SomeService someService){
        this.someService=someService;
    }
    @Override
    public String doSomething() {
        return "Run 2000 km, just do it!";
    }

    @Override
    public void getSomething() {
        someService.getSomething();
        System.out.println("Im injected!");
    }
}
