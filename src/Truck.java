class Vehicle{
    public void drive() {  System.out.println("Automobile: drive");   }
}

public class Truck extends Vehicle{
    public void drive() {  System.out.println("Truck: drive");   }
    public static void main (String args [ ]){

        Vehicle  vehicle = new Vehicle();
        Truck truck  = new Truck();

        vehicle.drive();
        truck.drive();
        vehicle = truck;
        vehicle.drive();

        /**
         * This program prints,
         * Automobile: drive
         * Truck: drive
         * Truck: drive
         *
         * In line 14, truck's reference variable changed to an instance of Vehicle class.
         * But in line 15 the program is printing same as line 14.
         * Because, instance methods are referring to methods of actual object's class. Not the reference variable's class.
         * (Only fields(static, instance), and static methods will refer to reference variable's class.)
         */


    }
}