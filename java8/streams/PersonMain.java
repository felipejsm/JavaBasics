import java.util.*;
/**
 * PersonMain
 */
public class PersonMain {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
            new Person("Rogerinho do Ingá", 27),
            new Person("Renan da Van", 30),
            new Person("Pedro", 40)
        );
        Person result = getStudentByName(persons, "Pedro");
        System.out.println(result.toString());
    }
    private static Person getStudentByName(List<Person> persons, String name) {
        Person result = null;
        for(Person p : persons) {
            if(name.equalsIgnoreCase(p.getName()) ) {
                result = p;
            }
        }
        return result;
    }
}