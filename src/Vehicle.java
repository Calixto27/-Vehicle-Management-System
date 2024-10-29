abstract class Vehicle implements Movable {

    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public abstract void move();

    public String showInfo() {
        return "brand='" + brand + '\'' + ", model='" + model + '\'' + ", year=" + year;
    }
}
