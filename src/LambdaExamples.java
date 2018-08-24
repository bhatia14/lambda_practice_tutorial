public class LambdaExamples {
    public static void main(String ar[]){
        String s= "hello";
        System.out.println(s);
        //calling lambda using Interface intialization
        Example e = ()->System.out.println("I am m1 body");
        e.method1();
        e.method2();

        //2 args
        Example2Args e2 = (a,b)->System.out.println(a+b);;
        e2.add(10, 20);

        //String return statement
        ExampleStringArg e3 = s1->s1.length();
        System.out.println(e3.length("a"));
    }
}
/**
 * No args Funtional Interface
 */
@FunctionalInterface 
interface Example{
    public void  method1();
    default void method2(){
        System.out.println("default method");
    }
    public static void method3(){
        System.out.println("Static method");
    }
}  


/**
 * 2 args functional Interface
 */
@FunctionalInterface 
interface Example2Args{
    public void add(int a, int b);
}  


/**
 * String args functional Interface
 */
@FunctionalInterface 
interface ExampleStringArg{
    public int length(String a);
}  