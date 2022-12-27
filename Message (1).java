package ATM;

//Polymorphism.
public class Message implements Ending_Message{
    @Override
    public void ending_message() {
        System.out.println("\nHave a nice day.");
    }
}
