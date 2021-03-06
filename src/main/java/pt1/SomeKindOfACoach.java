package pt1;

public class SomeKindOfACoach implements Coach {
    private SimpleService simpleService;
    private String email;
    private String firstName;
    private String lastName;

    // defining a constructor for dependency injection
    public SomeKindOfACoach(SimpleService simpleService){
        this.simpleService=simpleService;
    }
    // defining no-arg constructor just because compiler is no longer creating it for us
    public SomeKindOfACoach(){

    }

    /*
     * There is another way to inject dependency, you can do it with setters
     *
     *
     * EXAMPLE:
     * public void setYourService(SimpleService simpleService){
     * this.simpleService = simpleService
     * }
     *
     * */

    public void getDailyWorkout() {
        System.out.println("Do some workout, now!");
    }

    public String atYourService() {
        return simpleService.atYourService();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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


