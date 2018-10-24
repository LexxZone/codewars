package testIdeas;

import java.util.HashMap;
import java.util.Map;

public class TryMaps {

    public void doSomethingWithTheMap() {

    }

    public static void main(String[] args) {

        Map staff = new HashMap< String, Employee>();
        //HashMap реализует интерфейс Map
        Employee harry = new Employee("Harry Hacker");
        Employee jerry = new Employee("Jerry Hacker");
        Employee roanny = new Employee("Roanny Hacker");
        staff.put("987-98-9996", "Harry Hacker");
        staff.put("987-98-9973", "Jerry Hacker");
        staff.put("987-98-9517", "Roanny Hacker");

        //staff.values().stream().forEach();
        //staff.values().


        staff.forEach((k, v) ->
                System.out.println(v + "'s phone is " + k));

    }




}
