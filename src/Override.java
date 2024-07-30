// If you don't want override use final keyword :
// Error after using final keyword - java: cannot assign a value to final variable x

public class Override {
    final int x = 10;

    public static void main(String[] args){
        Override MyObj = new Override();
        System.out.println(MyObj.x);
//        MyObj.x = 100;
//        System.out.println(MyObj.x);
    }
}
