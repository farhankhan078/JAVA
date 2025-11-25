interface Vehicle {
    void start();
}

interface Machine {
    void stop();
}

class Car implements Vehicle, Machine {   // Multiple inheritance

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.stop();
    }
}
