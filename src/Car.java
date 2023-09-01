public class Car extends Vehicle implements ServiceTyre, ServiceEngine{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}