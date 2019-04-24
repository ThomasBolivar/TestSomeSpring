package pt2;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomService implements SomeService {

    private String [] array = {"Do Something","No work to do","Train for a while","Ops, no work to do, come again later"};
    private Random myRandom = new Random();
    @Override
    public String getSomething() {
        int index = myRandom.nextInt(array.length);
        String something = array[index];
        return something;
    }
}
