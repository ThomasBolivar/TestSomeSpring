package pt1;

public class BaseBallCoach implements Coach {
    private SimpleService simpleService;

    // defining a constructor for dependency injection
    public BaseBallCoach(SimpleService simpleService){
        this.simpleService=simpleService;
    }
    // defining no-arg constructor just because compiler is no longer creating it for us
    public BaseBallCoach(){

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
}
