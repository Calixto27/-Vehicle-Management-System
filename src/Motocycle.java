public class Motocycle extends Vehicle{
    private int engineCapacity;

    public Motocycle(String brand, String model, int year, int engineCapacity){
        super(brand,model,year);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void move() {
        System.out.println("Motocycle is moving");
    }

    @Override
    public String showInfo() {
        return "Motocycle{"+super.showInfo()+"Engine Capacity: "+engineCapacity+"}";
    }
}
