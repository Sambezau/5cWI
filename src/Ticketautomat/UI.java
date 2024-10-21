
package Ticketautomat;

public class UI {
    Controller controller;
    Scanner scanner;
    Geldausgabe geldausgabe;

    public UI (Controller controller, Scanner scanner, Geldausgabe geldausgabe)
    {
        this.controller = controller;
        this.scanner = scanner;
        this.geldausgabe = geldausgabe;
    }

    public void ButtonPressed()
    {
        System.out.println("Pressed the Button:     ");
        controller.CreateTicket();
    }

    public void InsertMoney(double betrag)
    {
        System.out.println(betrag + "€ eingeschmissen");
        if(betrag >= scanner.getPrice()){
            scanner.getTicket().setPayedTimeStamp(System.currentTimeMillis());
            geldausgabe.returnChange(scanner.getPrice()-betrag);
        } 
        else{
            System.out.println("Zu zahlen: " + (scanner.getPrice() - betrag));
        }
    }
}
