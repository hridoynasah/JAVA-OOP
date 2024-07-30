/*
Access Modifiers in Java:
________________________________________________________________________________
|Modifier     | Class | Package | Subclass (outside package) | Outside package |
|-------------|-------|---------|----------------------------|-----------------|
|Private      |   Y   |    N    |              N             |   N             |
|Default      |   Y   |    Y    |              N             |   N             |
|Protected    |   Y   |    Y    |              Y             |   N             |
|Public       |   Y   |    Y    |              Y             |   Y             |
|------------------------------------------------------------------------------|
*/

public class Access_Modifier {
    public static void main(String[] args){
        BankAccount Hrid = new BankAccount();
        Hrid.username = "hridoyhasan";
        System.out.println(Hrid.username);
        Hrid.setPassword("ufsd7t76fs");
        //System.out.println(Hrid.password);
        // Get a error - java: password has private access in BankAccount
        Hrid.getPassword();
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setUsername(String uname){
        username = uname;
    }
    public void setPassword(String pwd){
        password = pwd;
    }
    public void getPassword(){
        System.out.println(password);
    }
}