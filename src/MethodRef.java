interface Interface1{
    public void m1();
   // public String m2();
}


class Test{
    public void testM1(){
        System.out.println("Test m1 called");
    }
    public static String testM2(){
        System.out.println("Test m2 called");
        return "Test M2 called";
    }
       
}

class MethodRef{
    public static void main(String[] args) {

        Test test = new Test();
        Interface1 interface2 = test::testM1;
        interface2.m1();
        Interface1 interface1 = Test::testM2;
        interface1.m1();
    }
}