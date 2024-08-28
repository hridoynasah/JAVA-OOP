import java.awt.*;

interface Client{
    // Interface methods are public + abstract
    void webDesign();
    void webDevelop();
}

abstract class DeveloperX implements Client{
    @Override
    public void webDesign(){
        System.out.println("Purple, Top Menu, Three dot button.");
    }
}
class  DeveloperZ extends DeveloperX{
    @Override
    public  void webDevelop(){
        System.out.println("HTML, CSS, JavaScript.");
    }
}

public class CodeI {
    public static void main(String[] args){
        DeveloperZ d = new DeveloperZ();
        d.webDesign();
        d.webDevelop();
    }
}
