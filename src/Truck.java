public class Truck extends Vehicle implements ServiceEngine, ServiceTyre, ServiceTrailer{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {
        ServiceEngine.super.checkEngine();
    }

    @Override
    public void checkTrailer() {
        ServiceTrailer.super.checkTrailer();
    }

    @Override
    public void updateTyre() {
        ServiceTyre.super.updateTyre();
    }
}
