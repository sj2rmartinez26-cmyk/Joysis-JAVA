
package day20.discussion;


public class A {
    
    //variable
    protected String name = "Roland";
    // method
    void printName(){
        System.out.println("Roland");
    }
    public static void main(String[] args) {
        A a = new A();
        a.printName();
        System.out.println(a.name);
    }
    
    
}
