package b;

import a.AccessTest;

import static java.lang.Boolean.FALSE;

public class AccessTester extends AccessTest {
    public static void main(String[] args) {
        AccessTest ref = new AccessTest();
        ref.d();
        ref.c();

        /**
         * Here ref cannot access c() in parent class event if c() is protected.
         * Because, AccessTest is not a subclass of a AccessTest. (Only subclasses and class in the same package can access protected instances)
         * If we change line 7 as :- AccessTester ref = new AccessTester();
         * Then we cann access c();
         */

    }
}
