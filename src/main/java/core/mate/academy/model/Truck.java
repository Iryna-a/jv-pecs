package core.mate.academy.model;

public class Truck extends Machine {
    private String manufacturer;
    private int size;

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
