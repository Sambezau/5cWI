package VSC.SWP5.Exceptions;

public class Engine {

    public void start()throws EngineException {
        System.out.println("Enginge started");
        boolean hasError = true;

        if (hasError){
            throw new EngineException( "Engine start failed");
        }
    }
}

