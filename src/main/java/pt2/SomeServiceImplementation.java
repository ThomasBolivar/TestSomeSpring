package pt2;

import org.springframework.stereotype.Component;

@Component
public class SomeServiceImplementation implements SomeService {
    @Override
    public void getSomething() {
        System.out.println("Hey, im doing something");
    }
}
