import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        //To impolements class.
        Scanner scan = new Scanner(System.in);

        //Atributtes
            //To control the menu's option
        int opc = -1; //We start the attribute, bcs it has to enter the loop
            //Attributes to all the Vehicles
        String brand;
        String model;
        int year;
            //Specifics attributes for cars
        int numDoors;
            //Specifics attibutes for motocycles
        int engineCapacity;
        //Create the object Garage.
        Garage g1 = new Garage(5);

        //Menu to see the options
        do {
            System.out.println("Wellcome to Your Garage");
            System.out.println("--- Vehicle Management System ---");
            System.out.println("1. Add a Car");
            System.out.println("2. Add a Motorcycle");
            System.out.println("3. Show all vehicles in the garage ");
            System.out.println("4. MOve all Vehicles");
            System.out.println("5. Exit");
            System.out.println("Select the option: ");
            opc = scan.nextInt();
            scan.nextLine(); //to clen the buffer

            switch (opc){
                case 1:
                    System.out.println("############ \n ADD A CAR \n ##########");
                    System.out.println("Car Brand: ");
                    brand = scan.nextLine();
                    System.out.println("Car Model: ");
                    model = scan.nextLine();
                    System.out.println("Car Year: ");
                    year = scan.nextInt();
                    System.out.println("Number of car doors: ");
                    numDoors = scan.nextInt();
                    scan.nextLine(); //to clean the buffer.

                    //Create the object car
                    Car c1 = new Car(brand,model,year,numDoors);

                    //We try to add the Vehicle
                    g1.addVehicle(c1);
                    break;
                case 2:
                    System.out.println("############ \n ADD A MOTOCYCLE \n ##########");
                    System.out.println("Motocycle brand: ");
                    brand = scan.nextLine();
                    System.out.println("Motocycle Model: ");
                    model = scan.nextLine();
                    System.out.println("Motocycle Year: ");
                    year = scan.nextInt();
                    System.out.println("Motocycle Engine Capacity");
                    engineCapacity = scan.nextInt();

                    //Create an object Motocycle
                    Motocycle m1 = new Motocycle(brand,model,year,engineCapacity);

                    //We try to add the vehicle
                    g1.addVehicle(m1);
                    break;

                case 3:
                    System.out.println("#############\n Vehicles List \n #############");
                    g1.showVehicles();
                    break;
                case 4:
                    System.out.println("############\n Move all the Vehicles \n ##########");
                    g1.moveAll();
                    break;
                case 5:
                    System.out.println("Bye Bye, See U Soon");
                    break;
                default:
                    System.out.println("You select an inappropiate option\n Try again: ");
                    break;
            }
        }while (opc!=5);//only finish when select the option exit.
    }
}
