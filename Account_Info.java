package ATM;

//Encapsulation.
public class Account_Info {
    private int acNumber;
    private int pin;

    public void setAcNumber (int acNumber)
    {
        this.acNumber = acNumber;
    }
    public int getAcNumber ()
    {
        return acNumber;
    }

    public void setPin (int pin)
    {
        this.pin = pin;
    }
    public int getPin ()
    {
        return pin;
    }
}
