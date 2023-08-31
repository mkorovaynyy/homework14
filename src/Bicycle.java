public class Bicycle extends Vehicle implements ServiceTyre {


    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        ServiceTyre.super.updateTyre();
    }
}