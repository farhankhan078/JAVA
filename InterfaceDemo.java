interface Animal {
    void sound();
}

interface Dog extends Animal {   // Interface extending another interface
    void walk();
}

class PetDog implements Dog {    // Class implementing extended interface
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
    @Override
    public void walk() {
        System.out.println("Dog walks on 4 legs");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        PetDog d = new PetDog();
        d.sound();
        d.walk();
    }
}
