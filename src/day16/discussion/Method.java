
package day16.discussion;


public class Method {
    public static void main(String[] args) {
        printName("Summer");
        printName("Winter");
        printName("Fall");
    }
    public static void printName(String name) {
        for (int i=0; i<10; i++){
        System.out.println(name);
        }
    }



}

//    public static void main(String[] args) {
//        
//        System.out.println(greet("Winter"));
//    }
//    //syntax
//    public static String greet(String name){
//        return "Hello " + name;
//    }



//    public static void main(String[] args) {
//       //invoke the method
//        int result =  sum(50, 50);
//        System.out.println("The sum of the two numbers is: " + result);
//    }
//    
//    public static int sum (int a, int b){
//        return a + b;
//        
//        
//    }