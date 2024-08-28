import javax.swing.text.BadLocationException;

// Encapsulation: Data members are private, methods and constructors are private.
abstract class Bank_Account{
    private String Bank_Account_Number;
    private double Balance;
    public Bank_Account(String Bank_Account_Number, double Balance){
        this.Bank_Account_Number = Bank_Account_Number;
        this.Balance = Balance;
    }
    public String getBank_Account_Number(){ return Bank_Account_Number;}
    public double getBalance(){return Balance;}
}


public class Practice{
    public static void main(String[] args){

    }
}