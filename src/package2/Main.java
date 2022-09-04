package package2;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(191, 2003, "BMW", "Red"); // BMW
        Car c2 = new Car(193, 2002, "Opel", "Black");  //  Opel
        Car c3 = new Car(192, 2001, "Mercedes", "White");  // Mercedes
        Car[] c = {c1, c2, c3};

       Arrays.sort(c);
        for (Car temp : c) {
            System.out.println(temp);
        }
    }
}
