package pt2;

import org.springframework.stereotype.Component;

@Component
public class SomeServiceImplementation implements SomeService {
    @Override
    public String getSomething() {
        return "Hey, im doing something";
    }
}
