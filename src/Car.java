public class Car extends Vehicle{
    private int numDoors;

    public Car(String brand, String model, int year, int numDoors){
        super(brand,model,year);
        this.numDoors = numDoors;
    }

    @Override
    public void move() {
        System.out.println("car is moving");
    }

    @Override
    public String showInfo() {
        return "Car{"+super.showInfo()+" Doors number: "+numDoors+"}";
    }

}
