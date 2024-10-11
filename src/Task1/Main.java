package Task1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Andrei","Ginta Latina 12");
        Student student = new Student("Ion","Armeneasca 38","Java",2,5000);
        Staff staff = new Staff("Petru","31 August 2","LT Eminescu",15000);

        System.out.println(person.details());
        System.out.println();
        System.out.println(student.details());
        System.out.println();
        System.out.println(staff.details());
    }
}
