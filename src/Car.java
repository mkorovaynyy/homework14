public class Car extends Vehicle implements ServiceTyre, ServiceEngine{


    @Override
    public void checkEngine() {
        ServiceEngine.super.checkEngine();
    }

    @Override
    public void updateTyre() {
        ServiceTyre.super.updateTyre();
    }

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}