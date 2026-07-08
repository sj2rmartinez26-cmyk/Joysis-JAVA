
package day18.discussion;


public class Scope {
    int num = 10; // instance variable
    static int num2 = 20; // static variable
    
    public static void main(String[] args) {
        String name = "Roland";
        System.out.println(name);
        
        Scope scope = new Scope();
        System.out.println(scope.num);
        System.out.println(num2);
        
    }
    public void sum(){
            
            Scope scope = new Scope();
            System.out.println(scope.num);
            System.out.println(num2);
}
    public void greet(){
        if (true){
            int sum = 0; 
        }
        int i;
        for (i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
