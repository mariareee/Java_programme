/*There are two classes Vehicle and Car. The second class extends the first one.
Override toString in both classes to return a string representation of vehicles and cars.
If an object is Vehicle, the overridden method toString must return something
like: Vehicle{licensePlate=ABC123}

If an object is Car, the overridden method toString must return something like:
Car{licensePlate=ABC123,numberOfSeats=4}
*/
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle_1 = new Vehicle("ABC1234");
        Car car_1 = new Car("ABC1234",6);
        System.out.println(vehicle_1);
        System.out.println(car_1);
    }
}