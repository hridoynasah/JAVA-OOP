// Get : To return the value.
// Set : To modify the value, or set the value of properties.
// this : this keyword is used to refer to the current object.

public class Getters_Setters{
    public static void main(String[] args){
        Human h = new Human();
        // Call setEmotional:
        h.setEmotional();
        System.out.println(h.getEmotional());
        System.out.println(h.getHands());
        System.out.println(h.getLags());
    }
}

class Human{
    // Properties of human:
    private int hands = 2;
    private int lags = 2;

    // Behaviour of human:
    private boolean emotional;
    void setEmotional(){
        this.emotional = true;
    }
    boolean getEmotional(){
        return this.emotional;
    }
    int getHands(){
        return hands;
    }
    int getLags(){
        return lags;
    }

}