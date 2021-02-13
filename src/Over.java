//class A {
//    public int getCode(){ return 2;}
//
//    public asd.A getA(){
//        return new asd.A();
//    }
//}
//
//class AA extends asd.A {
//    //public long getCode(){ return 3;}
//    /**
//     * Line 6 will not compile because,
//     * When the return type of the overridden method (asd.A.getCode()) is a primitive,
//     * the return type of the overriding method (AA.getCode()) must match the return type of the overridden method.
//     */
//    public AA getA(){
//        return new AA();
//    }
//    /**
//     * When overriding getA() method, return types are not same
//     * This is allowed because, asd.A's return type is not a primitive and AA is a subclass of asd.A.
//     */
//}
//
//public class Over {
//
//    public static void main(String[] args) throws Exception {
//        asd.A a = new asd.A();
//        asd.A aa = new AA();
//        System.out.println(a.getCode()+" "+aa.getCode());
//    }
//
//    public int getCode() {
//        return 1;
//    }
//}