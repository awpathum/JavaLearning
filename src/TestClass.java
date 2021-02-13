class TestClass implements I1, I2{
    public void m1() { System.out.println("Hello"); }
    public static void main(String[] args){
        TestClass tc = new TestClass();

        tc.m1();
//        System.out.println(VALUE);
        /**
         * Having ambiguous fields does not cause any problems.
         * But referring to such fields cause problems.
         */
    }
}
interface I1{
    int VALUE = 1;
    void m1();
}
interface I2{
    int VALUE = 2;
    void m1();
}