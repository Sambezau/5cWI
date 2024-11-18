package VSC.SWP_OO.Exceptions;

public class Gui {
    public static void main(String[] args) {
        Engine e1 = new Engine();
        Car c1 = new Car("blue", e1);

        try{
            c1.startEngine();
        } catch (EngineException e){
            System.out.println(e);
        } catch (CarException e) {
            System.out.println(e);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
}
