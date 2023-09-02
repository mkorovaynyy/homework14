public class Truck extends Vehicle implements ServiceEngine, ServiceTyre, ServiceTrailer{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
