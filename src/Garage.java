
class Automobile {
    public int x = 10;

    public void sayHello() {
        System.out.println("Hello From AutoMobile");
    }

    public static void sayBye() {
        System.out.println("Bye from Automobile");
    }
}

class Car extends Automobile {
    private int x = 20;
}
public class Garage{
    public static void main(String[] args) {
        Car car = new Car();
//        System.out.println("x = " + car.x);
        Automobile automobile = (Automobile) car;
        System.out.println("x = " + automobile.x);

        /**
         * In this case x is hidden by Car class. Garage cannot access public x of Automobile class. (This is method hiding).
         * If we remove private access modifier of Car's x, program will compile and print "x = 20" in line 21.
         * We cannot access Automobile's x variable without casting Car to Automobile.
         * After casting in line 22, program will print "x = 10" in line 23. (need to comment line 21).
         */
    }
}
