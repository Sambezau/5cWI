
package VSC.SWP5.Exceptions;

import java.util.Random;

public class Car {

private Engine engine;
private String color;

    public Car(String color, Engine engine){
        this.color = color;
        this.engine = engine;
    }
    


    public void startEngine() throws EngineException, CarException{
        Random r = new Random();
        if (r.nextBoolean()){
            throw new CarException("Car has a problem starting");
        }
        if (r.nextBoolean()){
            throw new NullPointerException();
        }
        engine.start();
    }

    public Engine getEngine(){
        return engine;
    }
}
