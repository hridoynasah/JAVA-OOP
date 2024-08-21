class Copy_Constructor{
    int a; float b;
    Copy_Constructor(){
        a = 10;
        b = 5.54f;
    }
    Copy_Constructor(Copy_Constructor ref){
        a = ref.a;
        b = ref.b;
    }
}

public class Code4{
    public static void main(String[] args){
        Copy_Constructor CC = new Copy_Constructor();
        Copy_Constructor ref = new Copy_Constructor(CC);
    }
}