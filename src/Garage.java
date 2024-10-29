import java.util.ArrayList;

/**
 I created a spaces attribute that is not requested in the exercise,
 to better control the garage space,
 and if at any time you want to make it bigger, it can be easily modified.
 And I think is better control the space with an attribute than a simple number.
 */
public class Garage {
    static ArrayList<Vehicle> vehicles = new ArrayList();

    private int spaces;
    public Garage(int spaces){
        this.spaces = spaces;
    }
    public void addVehicle(Vehicle vehicle){
        if(vehicles.size()<this.spaces) {
            vehicles.add(vehicle);
        }else{
            System.out.println("the garage is full, you cant add more vehicles. ");
        }
    }

    public void showVehicles(){
        for(Vehicle v: vehicles){
            System.out.println(v.showInfo());
        }
    }
    public void moveAll(){
        for (Vehicle v: vehicles){
            v.move();
        }
    }
}
