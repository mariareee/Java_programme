/*Here are two classes Person and Patient. The second class extends the first one.
Override toString in both classes to return a string representation of persons and
patients.
If an object is Person, the overridden method toString must return something like:
Person{name=Case Maxwell,age=30}
If an object is Patient, the overridden method toString must return something
like:
Patient{name=John Purcell,age=30,height=182}*/
public class Main {
    public static void main(String[] args) {
        Person person_1 = new Person("Jay",32);
        Patient patient_1 = new Patient("Claudio",12,172);
        System.out.println(patient_1);
        System.out.println(person_1);
    }
}