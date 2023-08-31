public interface ServiceEngine {
    default public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
