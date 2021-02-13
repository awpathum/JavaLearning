package asd;

public class TestException {
    static String s = "";

    public static void m0(int a, int b) {
        s += a; // step 2: s = 1
        m2(); // step 3: called m2();
        m1(b); // step 4: m1(2);
    }

    public static void m1(int i) {
        s += i; // step 5: s = 12
        // step 6: s = 123
    }

    public static void m2() {
        try{
            throw new NullPointerException("aa");
        }catch (Exception exception){
            // step 4: catching the exception
        }
    }

    public static void m() {
        m0(1, 2); // step 1: called m0(1,2);
        m1(3); // step 3: called m1(3);
    }

    public static void main(String args[]) {
        try {
            m(); // step 0: called m0();
        } catch (Exception e) {
        }
        System.out.println(s); // step7: s = 123;
    }
}
