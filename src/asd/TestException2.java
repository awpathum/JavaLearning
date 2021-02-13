package asd;

public class TestException2 {
    static String s = "";

    public static void m0(int a, int b) {
        s += a; // step 2: s = 1;
        m2(); // step 3: m2();
        // step 4: after throwing is comes here. because m2() cannot handle the exception.
        // m0() also cannot handle the exception. therefore is goes to the method before m0() in the stack. ( calling method of m0(), which is m()).
        m1(b);
    }

    public static void m1(int i) {
        s += i;
    }

    public static void m2() {
        throw new NullPointerException("aa"); // step 4: throw NPE.
    }

    public static void m() {
        m0(1, 2); // step 1: m0(1,2);
        // step 5: m() also cannot handle the exception. Therefore it goes to main()
        m1(3);
    }

    public static void main(String args[]) {
        try {
            m(); // step 0: m();
        } catch (Exception e) {
            // step 6: exception will be handled here. So, m1() will not call.
        }
        System.out.println(s);
        // step 7: print 1.
    }
}