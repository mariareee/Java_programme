/*Only true or false
* Implement the method toPrimitive().It should take a value
* of Boolean type and return a boolean. If the passed value
* is null, the result should be false.*/
public class Main {
    public static void main(String[] args) {
        Primitive prime = new Primitive();
        System.out.println(prime.toPrimitive(false));
        System.out.println(prime.toPrimitive(null));
        System.out.println(prime.toPrimitive(true));

    }
}