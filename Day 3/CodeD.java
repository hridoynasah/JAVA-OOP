// Abstract Method
abstract class Animal {
    public abstract void sounds();

    public abstract void speed();
}

class Cat extends Animal {
    @Override
    public void sounds() {
        System.out.println("Meoooowwww");
    }

    @Override
    public void speed() {
        System.out.println("30 mph");
    }
}

// It's not an abstract method : It will give an error.
class Lion extends Animal {
    @Override
    public void sounds() {
        System.out.println("Roaaaaaaar");
    }

    @Override
    public void speed() {
        System.out.println("65 mph");
    }
}

public class CodeD {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal lion = new Lion();
        cat.sounds();
        lion.sounds();
    }
}
