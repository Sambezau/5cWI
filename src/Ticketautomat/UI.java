
package Ticketautomat;

public class UI {
    Controller controller;
    Scanner scanner;
    Geldausgabe geldausgabe;

    public UI (Controller controller, Scanner scanner, Geldausgabe geldausgabe)
    {
        this.controller = controller;
        this.geldausgabe = geldausgabe;
        this.scanner = scanner;
        
    }

    public void ButtonPressed()
    {
        System.out.println("Button is pressed:     ");
        controller.CreateTicket();
    }

    public void InsertMoney(double betrag)
    {
        System.out.println(betrag + "€ eingeworfen");

        if(betrag >= scanner.getPrice()){
            scanner.getTicket().setPayedTimeStamp(System.currentTimeMillis());
            geldausgabe.returnChange(scanner.getPrice()-betrag);
        } 
        else{
            System.out.println("Zu bezahlen: " + (scanner.getPrice() - betrag));
        }
    }
}
