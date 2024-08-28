interface Customer{
    // Interface variables are public static final.
    // We must initialize a final variable.
    int m = 45;
    // Interface methods are public abstract.
    void purchase();
}
class Seller implements  Customer{
    @Override
    public void purchase(){
        System.out.println("Customer needs $" + m + " dollar.");
    }

}
public class CodeH {
    public static void main(String[] args){
        Seller s = new Seller();
        s.purchase();
        // Variable is static
        // Static don't depends on object.
        // It can directly access from class.
        System.out.println(Customer.m);
    }
}
