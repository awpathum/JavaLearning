package asd;

class A{
    A() {  print();   }
    void print() { System.out.print("A "); }
}
public class B extends A{
    int i =   4;
    public static void main(String[] args){
        A a = new B();
        a.print();
    }
    void print() { System.out.print(i); }

    /**
     * Here, when an object of class B is created, first B's default constructor is called.
     * The first line of this constructor is a call to super(), which invokes A's constructor.
     * A's constructor in turn calls print(). Now, print is a non-private instance method and is therefore polymorphic,
     * which means, the selection of the method to be executed depends on the class of actual object on which it is invoked.
     * Here, since the class of actual object is B, B's print is selected instead of A's print.
     * At this point of time, variable i has not been initialized (because we are still in the middle of initializing A), so its default value i.e. 0 is printed.
     */

    /**
     * Finally 0 4 will print.
     */
}