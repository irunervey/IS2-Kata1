
package kata1;

import java.time.LocalDate;
import java.time.Period;




public class Person {
    private final String name;
    private final LocalDate fn ;
    
    public Person(String name, LocalDate fn){
        this.name = name;
        this.fn = fn;
    }
    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return fn;
    }

    public int getAge(){
        LocalDate fa = LocalDate.now();
        return (int)(Period.between(fn,fa).getYears());
    }
    
    
}
