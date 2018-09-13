
package kata1;

import java.time.LocalDate;
import java.time.Month;






public class Kata1 {

    
    public static void main(String[] args) {
        LocalDate date;
        date = LocalDate.of(1997, Month.MAY, 24);
        Person person = new Person("Iru", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
}
