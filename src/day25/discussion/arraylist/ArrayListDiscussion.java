
package day25.discussion.arraylist;

import java.util.ArrayList;


public class ArrayListDiscussion {
    public static void main(String[] args) {
        //
        ArrayList <String> cars = new ArrayList<>();
        cars.add("Isuzu");
        cars.add("Ferrari");
        cars.add("Ford");
        cars.add("Honda");
        cars.add("Toyota");
        cars.add(1, "Xiaomi");
        
        cars.set(0, "BMW");
        System.out.println(cars);
        System.out.println(cars.get(0));
        System.out.println(cars.size() -1);
        cars.remove(3);
        System.out.println(cars);
        
        cars.removeAll(cars);
        System.out.println(cars + "CLEARED");
    }
    
    /*CRUD Operation
    Create
    Read
    Update
    Delete
    */
}
